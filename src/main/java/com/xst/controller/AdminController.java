package com.xst.controller;

import com.sun.deploy.net.HttpResponse;
import com.xst.bean.CateBean;
import com.xst.bean.StatusMessage;
import com.xst.dao.*;
import com.xst.entity.*;

import com.xst.page.Page;
import com.xst.util.MultipartFileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpRequest;
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
            String videoUrl = MultipartFileUtils.saveFile(video,"src/main/webapp/assets/video",session);

            resourcesDao.addResource(title,cate1,cate2,cate3,videoUrl);
        }

//        redirectAttributes.addAttribute("resourceMsg","添加课程成功");
        return "redirect:/admin/resource/list";
    }


    @RequestMapping(value = "/login" , method = RequestMethod.GET)
    public String login(){
        return "admin/login";
    }

    @ResponseBody
    @RequestMapping(value = "/login" , method = RequestMethod.POST)
    public StatusMessage  login(String username , String password , HttpSession session){

        String message = "";
        StatusMessage statusMessage = null;

        if(username == ""){
            message = "请输入用户名!";
            statusMessage=new StatusMessage(0,message);

        }
        else if(!adminDao.isUsernameExit(username)){
            message="用户名不存在!";
            statusMessage=new StatusMessage(0,message);

        }
        else{
            V9Admin admin = adminDao.getByName(username);
            System.out.println(admin.getUsername()+"   "+admin.getPassword());
            if(password == ""){
                message = "请输入密码!";
                statusMessage=new StatusMessage(0,message);
            }else if(!admin.getPassword().equals(password)){
                message = "密码错误!";
                statusMessage=new StatusMessage(0,message);
            }else {

                message = "管理员登陆成功!";
                session.setAttribute("loginUser",admin);
                statusMessage=new StatusMessage(1,message);
                System.out.println("message1 : "+message);
                //redirectAttributes.addFlashAttribute("loginMsg",message);
                //return "redirect:index";
            }
        }

//        System.out.println("message : "+message);
        //statusMessage.setStatus(status);
        //statusMessage.setMessage(message);
        //redirectAttributes.addFlashAttribute("loginMsg",message);
        //return "redirect:/admin/login";
        return statusMessage;
    }


    //@ResponseBody
    @RequestMapping(value = "/index" , method = RequestMethod.GET)
    public String index(HttpSession session,RedirectAttributes redirectAttributes){
        V9Admin admin = (V9Admin) session.getAttribute("loginUser");
        if(admin==null){
            return "redirect:login";
        }
        return "admin/index";
    }


    /**
     * 分页显示资讯
     * @param model
     * @param page
     * @return
     */
    @RequestMapping(value = "/news/list" , method = RequestMethod.GET)
    public String listNews(Model model, String page){
        int pageNum = page == null ? 1 : Integer.valueOf(page);
        Page<V9News> newsPage=newsDao.queryForNewsListByPage(pageNum,15);
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

        V9Admin admin=(V9Admin)session.getAttribute("loginUser");
        String username=null;
        if(admin!=null){
            username=admin.getUsername();
        }

        if(username==null){
            username="admin";
        }
        newsDao.addNews(title,description,content,arr_group_id,type,username);
        redirectAttributes.addFlashAttribute("Msg","添加成功！");//session在跳到页面后马上移除对象
        return "redirect:/admin/news/list";
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
        //model.addAttribute("Msg",Msg);
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
    public String refuseMember(Model model , @RequestParam(value = "userid[]")int[]  userid,RedirectAttributes redirectAttributes){
        memberDao.refuseMember(userid);

        redirectAttributes.addFlashAttribute("Msg","已拒绝!");
        return "redirect:/admin/verify/list";
    }


    /**
     *拒绝一个待验证用户
     * @param model
     * @param userid
     * @return
     */
    @RequestMapping(value = "/member/refuse/{userid}",method = RequestMethod.GET)
    public String refuseOneMember(Model model ,@PathVariable("userid")int  userid,RedirectAttributes redirectAttributes){

        memberDao.refuseMember(new int[]{userid});
        redirectAttributes.addFlashAttribute("Msg","已拒绝!");
        return "redirect:/admin/verify/list";
    }

    /**
     * 批量通过待验证的用户
     * @param model
     * @param userid
     * @return
     */
    @RequestMapping(value = "/member/accept",method = RequestMethod.POST)
    public String acceptMember(Model model , @RequestParam(value = "userid[]")int[]  userid,RedirectAttributes redirectAttributes){
        memberDao.acceptMember(userid);
        redirectAttributes.addFlashAttribute("Msg","已通过!");
        return "redirect:/admin/verify/list";
    }

    /**
     *通过一个待验证用户
     * @param model
     * @param userid
     * @return
     */
    @RequestMapping(value = "/member/accept/{userid}",method = RequestMethod.GET)
    public String acceptOneMember(Model model ,@PathVariable("userid")int  userid,RedirectAttributes redirectAttributes){

        memberDao.acceptMember(new int[]{userid});
        redirectAttributes.addFlashAttribute("Msg","已通过!");
        return "redirect:/admin/verify/list";
    }

    /**
     * 批量或删除新闻
     * @param model
     * @param id
     * @return
     */
    @RequestMapping(value = "/news/delete",method = RequestMethod.POST)
    public String deleteNews(Model model,@RequestParam(value = "id[]")int[]  id,RedirectAttributes redirectAttributes){
        newsDao.deleteAll(id);
        redirectAttributes.addFlashAttribute("Msg", "删除成功！");
        return "redirect:/admin/news/list";
    }


    @RequestMapping(value = "/news/delete/{newsId}",method = RequestMethod.GET)
    public String deleteOneNews(Model model,@PathVariable("newsId") int newsId,RedirectAttributes redirectAttributes){
        newsDao.deleteAll(new int[]{newsId});
        redirectAttributes.addFlashAttribute("Msg", "删除成功！");
        return "redirect:/admin/news/list";
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

        String username =null;
        V9Admin admin=(V9Admin) session.getAttribute("loginUser");
        if(admin!=null){
            username=admin.getUsername();
        }
        if(username==null){
            username="admin";
        }
        newsDao.updateNews(newsId,title,description,content,arr_group_id,type,username);
        redirectAttributes.addFlashAttribute("Msg","编辑成功！!");
        return "redirect:/admin/news/list";
    }



}
