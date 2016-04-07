package com.xst.controller;

import com.xst.bean.CateBean;
import com.xst.dao.GroupDao;
import com.xst.dao.NewsDao;
import com.xst.dao.ResourcesDao;
import com.xst.entity.V9Group;
import com.xst.entity.V9News;
import com.xst.entity.V9Resources;
import com.xst.page.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by jeff on 16/4/6.
 */

@Controller
@RequestMapping("/group")
public class GroupController {

    @Autowired
    private GroupDao groupDao;

    @Autowired
    private ResourcesDao resourcesDao;

    @Autowired
    private NewsDao newsDao;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String listByPage(Model model, String page){
        int pageNum = page == null ? 1 : Integer.valueOf(page);
        System.out.println(pageNum);


        Page<V9Group> pageGroup = groupDao.queryGpListByPage(pageNum, 12);

        model.addAttribute("page", pageGroup);
        model.addAttribute("currentPage", pageNum);
        return "group/list";
    }

    @RequestMapping(value = "/{id}/resources", method = RequestMethod.GET)
    public String resource(Model model, @PathVariable int id, String page){
        int pageNum = page == null ? 1 : Integer.valueOf(page);

        V9Group group = groupDao.getById(id);
        Page<V9Resources> resources = resourcesDao.queryGroupResources(id, pageNum, 15);

        model.addAttribute("currentPage", pageNum);
        model.addAttribute("group", group);
        model.addAttribute("page", resources);

        return "group/resource";
    }

    @RequestMapping(value = "/{id}/news", method = RequestMethod.GET)
    public String news(Model model, @PathVariable int id, String page){
        int pageNum = page == null ? 1 : Integer.valueOf(page);

        V9Group group = groupDao.getById(id);
        Page<V9News> news = newsDao.queryGroupNews(id, pageNum, 15);

        model.addAttribute("currentPage", pageNum);
        model.addAttribute("group", group);
        model.addAttribute("page", news);

        return "group/news";
    }
}
