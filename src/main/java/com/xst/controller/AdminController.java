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
import java.util.Map;

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

        return "admin/courselist";
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

        return "admin/courseadd";
    }


    //@ResponseBody
    @RequestMapping(value = "/resource/add" , method = RequestMethod.POST)
    public String addResource(String title , int cate1 , int cate2 , int cate3 ,
                              MultipartFile video , RedirectAttributes redirectAttributes ,
                              HttpSession session){

        System.out.println("addResource");
        if(!video.isEmpty()){

            String filePath = session.getAttribute("uploadFilePath").toString();
//            String videoUrl = MultipartFileUtils.saveFile(video,filePath);
            String videoUrl = MultipartFileUtils.saveFile(video,"/usr/local/xst/video");

            resourcesDao.addResource(title,cate1,cate2,cate3,videoUrl);
        }

        redirectAttributes.addAttribute("resourceMsg","添加课程成功");
        return "redirect:/resource/view";
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








    @RequestMapping(value = "/news/list" , method = RequestMethod.GET)
    public String listNews(Model model){

        return "admin/newslist";
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
        Map<String,String> map=(Map<String, String>)redirectAttributes.getFlashAttributes();
        System.out.println(map.get("addNewsMsg"));
        model.addAttribute("addNewsMsg",map.get("addNewsMsg"));
        model.addAttribute("Msg","添加成功！");
        return "news/success";
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
        model.addAttribute("page",memberPage);
        model.addAttribute("currentPage", pageNum);
        return "admin/membercheck";
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
        return "admin/memberlist";
    }

    /**
     *批量拒绝一个待验证用户
     * @param model
     * @param userid
     * @return
     */
    @RequestMapping(value = "/member/refuse",method = RequestMethod.GET)
    public String refuseMember(Model model , @RequestParam(value = "userid[]")int[]  userid){
        memberDao.refuseMember(userid);
        model.addAttribute("verifyMsg","已拒绝！");
        return "admin/verify";
    }

    /**
     * 批量通过一个待验证的用户
     * @param model
     * @param userid
     * @return
     */
    @RequestMapping(value = "/member/accept",method = RequestMethod.GET)
    public String acceptMember(Model model , @RequestParam(value = "userid[]")int[]  userid){
        memberDao.acceptMember(userid);
        model.addAttribute("verifyMsg","已通过");
        return "admin/verify";
    }

    /**
     * 批量或删除新闻
     * @param model
     * @param id
     * @return
     */
    @RequestMapping(value = "/news/delete",method = RequestMethod.GET)
    public String deleteNews(Model model,@RequestParam(value = "id[]")int[]  id){
        newsDao.deleteAll(id);
        model.addAttribute("deleteNewsMsg","删除成功");
        return "admin/deleteNewsSuccess";
    }

    /**
     * 查看一条新闻
     * @param model
     * @param newsId
     * @return
     */
    @RequestMapping(value= "/view/news/{newsId}",method = RequestMethod.GET)
    public String viewNews(Model model,@PathVariable("newsId") int newsId){
        V9News news=newsDao.getById(newsId);
        model.addAttribute("news",news);
        System.out.println(news);
        return "news/view";
    }

    /**
     * 编辑资讯
     * @param model
     * @param newsId
     * @return
     */
    @RequestMapping(value = "/edit/news/{newsId}",method = RequestMethod.GET)
    public String editNews(Model model,@PathVariable("newsId") int newsId){
        V9News news=newsDao.getById(newsId);
        model.addAttribute("news",news);
        return "news/addNews";
    }




}
