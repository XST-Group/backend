package com.xst.controller;

import com.xst.bean.CateBean;
import com.xst.bean.StatusMessage;
import com.xst.dao.*;
import com.xst.entity.*;

import com.xst.page.Page;
import com.xst.util.MultipartFileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by sl on 16-4-4.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private NewsDao newsDao;

    @Autowired
    @Qualifier("categoryDao")
    private CategoryDao categoryDao;

    @Autowired
    @Qualifier("resourcesDao")
    private ResourcesDao resourcesDao;

    @Autowired
    @Qualifier("adminDao")
    private AdminDao adminDao;

/*    @Autowired
    private MemberVerifyDao MemVerifyDao;*/


    @Autowired
    private MemberDao memberDao;


    @RequestMapping(value = "/resource/list" , method = RequestMethod.GET)
    public String listResource(Model model){

        return "admin/course/courselist";
    }
    /**
     * 添加课程，GET
     * @param model
     * @return 一级目录
     */
    @RequestMapping(value = "/resource/add" , method = RequestMethod.GET)
    public String addResource(Model model){

        List<CateBean> fisrtCategorys = categoryDao.getFirstCategory();

        model.addAttribute("firstCategorys",fisrtCategorys);

        return "admin/course/courseadd";
    }


    //@ResponseBody
    @RequestMapping(value = "/resource/add" , method = RequestMethod.POST)
    public String addResource(String title , int cate1,int cate2,int cate3,
                              MultipartFile video , HttpSession session){

//        String title = request.getParameter("title");
        System.out.println("addResource : " + title);
        System.out.println("cates : "+cate1+" "+cate2+" "+cate3);
        System.out.println("video size : "+video.getSize());

        if(!video.isEmpty()){

            String filePath = session.getAttribute("uploadFilePath").toString();
//            String videoUrl = MultipartFileUtils.saveFile(video,filePath);
            String videoUrl = MultipartFileUtils.saveFile(video,"/usr/local/xst/video");

            resourcesDao.addResource(title,cate1,cate2,cate3,videoUrl);
        }

//        redirectAttributes.addAttribute("resourceMsg","添加课程成功");
        return "redirect:/admin/resource/list";
    }


    @RequestMapping(value = "/login" , method = RequestMethod.GET)
    public String login(){
        return "admin/login";
    }

    //@ResponseBody
    @RequestMapping(value = "/login" , method = RequestMethod.POST)
    public String  login(String username , String password , HttpSession session ,
                         RedirectAttributes redirectAttributes){
        int status = 0;
        String message = "";
        StatusMessage statusMessage = new StatusMessage(status,message);

        if(username == ""){
            message = "请输入用户名";
        }else{
            V9Admin admin = adminDao.getByName(username);
            System.out.println(admin.getUsername()+"   "+admin.getPassword());
            if(password == ""){
                message = "请输入密码";
            }else if(!admin.getPassword().equals(password)){
                message = "密码错误";
            }else {
                status = 1;
                message = "管理员登陆成功";
                session.setAttribute("loginUser",admin);
                statusMessage.setStatus(status);
                statusMessage.setMessage(message);
                System.out.println("message1 : "+message);
               // redirectAttributes.addAttribute("loginMsg",message);
                return "redirect:index";
            }
        }

        System.out.println("message : "+message);
        statusMessage.setStatus(status);
        statusMessage.setMessage(message);
//        redirectAttributes.addAttribute("loginMsg","登录失败");
        return "redirect:login";
    }


    //@ResponseBody
    @RequestMapping(value = "/index" , method = RequestMethod.GET)
    public String index(){
        return "admin/index";
    }


    /**
     * 分页显示资讯
     * @param model
     * @param page
     * @return
     */
    @RequestMapping(value = "/news/list" , method = RequestMethod.GET)
    public String listNews(Model model,String page){
        int pageNum = page == null ? 1 : Integer.valueOf(page);
        Page<V9News> newsPage=newsDao.queryForNewsListByPage(pageNum,15);
        System.out.println(newsPage.getList().get(0).getDescription());
        model.addAttribute("page",newsPage);
        model.addAttribute("currentPage", pageNum);
        return "admin/news/newslist";
    }


    /**
     * 添加资讯
     * @param title
     * @param description
     * @param redirectAttributes
     * @return
     */
    @RequestMapping(value = "/news/add" , method = RequestMethod.POST)
    public String addNews( String title, String description,String content,
                           RedirectAttributes redirectAttributes,String arr_group_id,String type, HttpSession session){

        System.out.println(content);
        String username=(String)session.getAttribute("loginUser");
        if(username==null){
            username="admin";
        }
        newsDao.addNews(title,description,content,arr_group_id,type,username);
        redirectAttributes.addFlashAttribute("addNewsMsg","资讯添加成功");//session在跳到页面后马上移除对象
        return "redirect:/admin/news/success";
    }

    /**
     * 重定向
     * @param model
     * @return
     */
    @RequestMapping(value="/news/success",method = RequestMethod.GET)
    public String success(Model model,RedirectAttributes redirectAttributes){
        //Map<String,String> map=(Map<String, String>)redirectAttributes.getFlashAttributes();
        //System.out.println(map.get("addNewsMsg"));
       // model.addAttribute("addNewsMsg",map.get("addNewsMsg"));
        model.addAttribute("Msg","添加成功！");
        return "admin/news/addnewsuccess";
    }

    /**
     * 分页显示待验证用户
     * @param model
     * @param page
     * @return
     */
    @RequestMapping(value = "/verify/list" ,method = RequestMethod.GET)
    public String viewMemberVerify(Model model,String page){
        int pageNum = page == null ? 1 : Integer.valueOf(page);
        Page<V9Member> memberPage=memberDao.queryForMemList(pageNum,15,0);
        model.addAttribute("page", memberPage);
        model.addAttribute("currentPage", pageNum);
        return "admin/member/membercheck";
    }

    /**
     * 分页显示通过验证用户
     * @param model
     * @param page
     * @return
     */
    @RequestMapping(value = "/member/list",method = RequestMethod.GET)
    public String viewMemberList(Model model, String page){

        int pageNum = page == null ? 1 : Integer.valueOf(page);
        Page<V9Member> memberPage=memberDao.queryForMemList(pageNum,15,1);
        model.addAttribute("page",memberPage);
        model.addAttribute("currentPage", pageNum);
        return "admin/member/memberlist";
    }

    /**
     *批量拒绝待验证用户
     * @param model
     * @param userid
     * @return
     */
    @RequestMapping(value = "/member/refuse",method = RequestMethod.POST)
    public String refuseMember(Model model , @RequestParam(value = "userid[]")int[]  userid){
        memberDao.refuseMember(userid);

        model.addAttribute("verifyMsg", "已拒绝！");
        return "admin/member/refusesuccess";
    }


    /**
     *拒绝一个待验证用户
     * @param model
     * @param userid
     * @return
     */
    @RequestMapping(value = "/member/refuse/{userid}",method = RequestMethod.GET)
    public String refuseOneMember(Model model ,@PathVariable("userid")int  userid){

        memberDao.refuseMember(new int[]{userid});
        model.addAttribute("verifyMsg","已拒绝！");
        return "admin/member/refusesuccess";
    }

    /**
     * 批量通过待验证的用户
     * @param model
     * @param userid
     * @return
     */
    @RequestMapping(value = "/member/accept",method = RequestMethod.POST)
    public String acceptMember(Model model , @RequestParam(value = "userid[]")int[]  userid){
        memberDao.acceptMember(userid);
        model.addAttribute("verifyMsg","已通过");
        return "admin/member/acceptsuccess";
    }

    /**
     *通过一个待验证用户
     * @param model
     * @param userid
     * @return
     */
    @RequestMapping(value = "/member/accept/{userid}",method = RequestMethod.GET)
    public String acceptOneMember(Model model ,@PathVariable("userid")int  userid){

        memberDao.acceptMember(new int[]{userid});
        model.addAttribute("verifyMsg","已通过！");
        return "admin/member/acceptsuccess";
    }

    /**
     * 批量或删除新闻
     * @param model
     * @param id
     * @return
     */
    @RequestMapping(value = "/news/delete",method = RequestMethod.POST)
    public String deleteNews(Model model,@RequestParam(value = "id[]")int[]  id){
        newsDao.deleteAll(id);
        model.addAttribute("deleteNewsMsg","删除成功");
        return "admin/news/deleteNewsSuccess";
    }

    @RequestMapping(value = "/news/delete/{newsId}",method = RequestMethod.GET)
    public String deleteOneNews(Model model,@PathVariable("newsId") int newsId){
        newsDao.deleteAll(new int[]{newsId});
        model.addAttribute("deleteNewsMsg","删除成功");
        return "admin/news/deleteNewsSuccess";
    }

    /**
     * 查看一条新闻
     * @param model
     * @param newsId
     * @return
     */
    @RequestMapping(value= "/news/view/{newsId}",method = RequestMethod.GET)
    public String viewNews(Model model,@PathVariable("newsId") int newsId){
        V9News news=newsDao.getById(newsId);
        model.addAttribute("news", news);
        System.out.println(news);
        return "admin/news/viewnews";
    }

    /**
     * 编辑资讯,获取待编辑的内容
     * @param model
     * @param newsId
     * @return
     */
    @RequestMapping(value = "/news/edit/{newsId}",method = RequestMethod.GET)
    public String editNews(Model model,@PathVariable("newsId") int newsId){
        V9News news=newsDao.getById(newsId);
        model.addAttribute("news", news);
        return "admin/news/editnews";
    }


    /**
     * 编辑之后进行更新
     * @param model
     * @param newsId
     * @param title
     * @param description
     * @param content
     * @param redirectAttributes
     * @param arr_group_id
     * @param type
     * @param session
     * @return
     */
    @RequestMapping(value = "/news/update/{newsId}" ,method = RequestMethod.POST)
    public String update(Model model,@PathVariable("newsId") int newsId,String title, String description,String content,
                         RedirectAttributes redirectAttributes,String arr_group_id,String type, HttpSession session){

        String username=(String)session.getAttribute("loginUser");
        if(username==null){
            username="admin";
        }
        newsDao.updateNews(newsId,title,description,content,arr_group_id,type,username);
        model.addAttribute("Msg","编辑成功！");
        return "redirect:/admin/news/success";
    }



}
