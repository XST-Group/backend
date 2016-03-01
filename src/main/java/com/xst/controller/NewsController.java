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
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model){
        List<V9News> newsList=newsDao.queryForNewsList();
        model.addAttribute("newsList",new ArrayList<>(newsList));
        model.addAttribute("newsMsg","newsList");
        return "news/list";
}

    /**
     * 默认的分页，1页，10条
     * @param model
     * @return
     */
    @RequestMapping(value = "/view",method=RequestMethod.GET)
    public String view(Model model){
        int pagenow=1;
        int pagesize=10;
        String hql="from V9News as news where news.thumb!='' order by news.listorder desc,news.updatetime desc ";
        Query query=newsDao.query(hql);
        Page<V9News> newsPage=newsPageHandler.getPage(pagenow,pagesize,V9News.class,query);
        model.addAttribute("newsPageBean",newsPage);
        System.out.println(newsPage);
        return "news/list";
    }

    /**
     * 分页查询新闻
     * @param model
     * @param pageNow
     * @param pageSize
     * @return
     */
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
        String hql="from V9News as news where news.thumb!='' order by news.listorder desc,news.updatetime desc ";
        Query query=newsDao.query(hql);
        Page<V9News> newsPage=newsPageHandler.getPage(pagenow,pagesize,V9News.class,query);
        model.addAttribute("newsPageBean",newsPage);
        System.out.println(newsPage);
        return "news/list";
    }

    /**
     * 查询前5条新闻
     * @param model
     * @return
     */
    @RequestMapping(value="/view/five",method=RequestMethod.GET)
    public String view_five(Model model){
        int pagenow=1;
        int pagesize=5;
        String hql="from V9News as news where news.thumb!='' order by news.listorder desc,news.updatetime desc ";
        Query query=newsDao.query(hql);
        query.setFirstResult(1);
        query.setMaxResults(5);
        Page<V9News> newsPage=newsPageHandler.getPage(pagenow,pagesize,V9News.class,query);
        model.addAttribute("newsPageBean",newsPage);
        System.out.println(newsPage);
        return "news/list";
    }
}
