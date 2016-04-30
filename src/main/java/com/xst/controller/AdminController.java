package com.xst.controller;

import com.xst.bean.CateBean;
import com.xst.bean.StatusMessage;
import com.xst.dao.AdminDao;
import com.xst.dao.CategoryDao;
import com.xst.dao.NewsDao;
import com.xst.dao.ResourcesDao;
import com.xst.entity.V9Admin;
import com.xst.entity.V9News;
import com.xst.entity.V9NewsData;

import com.xst.util.MultipartFileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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


    /**
     * 添加课程，GET
     * @param model
     * @return 一级目录
     */
   // @ResponseBody
    @RequestMapping(value = "/resource/add" , method = RequestMethod.GET)
    public String addResource(Model model){

        List<CateBean> fisrtCategorys = categoryDao.getFirstCategory();

        model.addAttribute("firstCategorys",fisrtCategorys);

        return "admin/addresource";
    }


    @ResponseBody
    @RequestMapping(value = "/resource/add" , method = RequestMethod.POST)
    public String addResource(String title , int category1id , int category2id , int category3id ,
                              MultipartFile video , RedirectAttributes redirectAttributes ,
                              HttpSession session){

        if(!video.isEmpty()){

            String filePath = session.getAttribute("uploadFilePath").toString();
            String videoUrl = MultipartFileUtils.saveFile(video,filePath);

            resourcesDao.addResource(title,category1id,category2id,category3id,videoUrl);
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

    /**
     * 添加资讯
     * @param catid
     * @param typeid
     * @param title
     * @param style
     * @param thumb
     * @param keywords
     * @param description
     * @param url
     * @param listorder
     * @param status
     * @param username
     * @param redirectAttributes
     * @return
     */
    @RequestMapping(value = "/news/add" , method = RequestMethod.POST)
    public String addNews( int catid, int typeid,String title, String style, String thumb,
                           String keywords, String description, String url, int listorder,byte status, String username,
                           RedirectAttributes redirectAttributes,String arr_group_id,String type,String content){

        long currentTime=System.currentTimeMillis()/1000;//Java里面获取的是毫秒，除以1000，单位为秒，不然存的时候会超出int
        System.out.println("时间戳"+currentTime);

        System.out.println(content);

        V9News news= new V9News((short)catid, (short)typeid, title, style, thumb, keywords,  description
                , false, url, (byte)listorder, status, false, false, username, (int)currentTime, (int)currentTime,
                arr_group_id,type,content);
        //news.setV9NewsData(newsData);
        //newsData.setId(new Integer(news.getId()));
        //news.setV9NewsData(newsData);
        newsDao.addNews(news);
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

}
