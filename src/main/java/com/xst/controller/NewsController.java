package com.xst.controller;

import com.xst.entity.V9News;
import com.xst.dao.NewsDao;
import com.xst.page.Page;
import com.xst.page.PageHandler;
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
    private PageHandler<V9News> newsPageHandler;
    @Autowired
    private NewsDao newsDao;

    /**
     * 分页查询新闻
     * @param model
     * @param page 页码
     * @return
     */
    @RequestMapping(value="/list",method=RequestMethod.GET)
    public String view(Model model, String page){

        int pageNum = page == null ? 1 : Integer.valueOf(page);

        Page<V9News> pageNews = newsDao.queryForNewsListByPage(pageNum, 15);
        model.addAttribute("page",pageNews);
        model.addAttribute("currentPage", pageNum);
        return "news/list";
    }

    /**
     * 查看一条新闻
     * @param model
     * @param newsId
     * @return
     */
    @RequestMapping(value= "/view/{newsId}",method = RequestMethod.GET)
    public String viewNews(Model model,@PathVariable("newsId") int newsId){
        V9News news=newsDao.getById(newsId);
        model.addAttribute("news",news);
        System.out.println(news);
        return "news/list";
    }
}
