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
     * 默认的分页，第一页，10条
     * @param model
     * @return
     */
    @RequestMapping(value = "/list",method=RequestMethod.GET)
    public String view(Model model){
        Page<V9News> page = newsDao.queryForNewsListByPage(1, 15);
        model.addAttribute("page",page);
        return "news/list";
    }

    /**
     * 分页查询新闻
     * @param model
     * @param pageNum 页码
     * @return
     */
    @RequestMapping(value="/list/{pageNum}",method=RequestMethod.GET)
    public String view(Model model, @PathVariable("pageNum") int pageNum){
        Page<V9News> page = newsDao.queryForNewsListByPage(pageNum, 15);
        model.addAttribute("page",page);
        return "news/list";
    }
}
