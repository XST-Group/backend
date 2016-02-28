package com.xst.controller;

import com.xst.entity.V9News;
import com.xst.dao.NewsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    @RequestMapping(value = "/list  ", method = RequestMethod.GET)
    public String list(Model model){
        List<V9News> newsList=newsDao.queryForNewsList();
        model.addAttribute("newsList",new ArrayList<>(newsList));
        model.addAttribute("newsMsg","newsList");
        return "news/list";
    }
}
