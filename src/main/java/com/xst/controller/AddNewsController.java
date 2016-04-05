package com.xst.controller;

import com.xst.dao.NewsDao;
import com.xst.entity.V9News;
import com.xst.entity.V9NewsData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Date;
import java.util.Map;

/**
 * Created by CrazyCodess on 2016/4/5.
 */
@Controller
@RequestMapping("/addNews")
public class AddNewsController {

    @Autowired
    private NewsDao newsDao;

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
    @RequestMapping(value = "/add" , method = RequestMethod.POST)
    public String addNews( int catid, int typeid,String title, String style, String thumb,
                           String keywords, String description, String url, int listorder,byte status, String username,
                           RedirectAttributes redirectAttributes,String arr_group_id){
        long currentTime=System.currentTimeMillis()/1000;//Java里面获取的是毫秒，除以1000，单位为秒，不然存的时候会超出int
        System.out.println("时间戳"+currentTime);
        V9News news= new V9News((short)catid, (short)typeid, title, style, thumb, keywords,  description
                , false, url, (byte)listorder, status, false, false, username, (int)currentTime, (int)currentTime,new V9NewsData(),
                arr_group_id);
        newsDao.addNews(news);
        redirectAttributes.addFlashAttribute("addNewsMsg","资讯添加成功");//session在跳到页面后马上移除对象
        return "redirect:/addNews/success";
    }

    /**
     * 重定向
     * @param model
     * @return
     */
    @RequestMapping(value="/success",method = RequestMethod.GET)
    public String success(Model model,RedirectAttributes redirectAttributes){
        Map<String,String> map=(Map<String, String>)redirectAttributes.getFlashAttributes();
        System.out.println(map.get("addNewsMsg"));
        model.addAttribute("addNewsMsg",map.get("addNewsMsg"));
        model.addAttribute("Msg","添加成功！");
        return "news/success";
    }

}