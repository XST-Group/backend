package com.xst.controller;

import com.xst.Service.NewsPageHandler;
import com.xst.bean.PageBean;
import com.xst.entity.V9News;
import com.xst.dao.NewsDao;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CrazyCodess on 2016/2/26.
 */
@Controller
@RequestMapping("/news")
public class NewsController {
    @Autowired
    private NewsDao newsDao;
    @Autowired
    private NewsPageHandler newsPageHandler;
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model){
        List<V9News> newsList=newsDao.queryForNewsList();
        model.addAttribute("newsList",new ArrayList<>(newsList));
        model.addAttribute("newsMsg","newsList");
        return "news/list";
}
    @RequestMapping(value = "/view",method=RequestMethod.GET)
    public String view(Model model){
        int pagenow=1;
        int pagesize=10;
        PageBean<V9News> pageBean=newsPageHandler.getNews(pagenow,pagesize);
        model.addAttribute("newsPageBean0",pageBean);
        System.out.println(pageBean);
        return "news/list";
    }
    @RequestMapping(value="/view/{pageNow}/{pageSize}",method=RequestMethod.GET)
    public String view(Model model, @PathVariable("pageNow") String pageNow,@PathVariable("pageSize") String pageSize){
        int pagenow=1;
        int pagesize=10;
        if(pageNow!=null){
            pagenow=Integer.valueOf(pageNow);

        }
        if(pageSize!=null){
            pagesize=Integer.valueOf(pageSize);
        }
        PageBean<V9News> pageBean=newsPageHandler.getNews(pagenow,pagesize);
        model.addAttribute("newsPageBean",pageBean);
        System.out.println(pageBean);
        return "news/list";
    }
}
