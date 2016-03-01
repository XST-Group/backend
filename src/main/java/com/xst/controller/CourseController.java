package com.xst.controller;

import com.xst.annotations.Link;
import com.xst.bean.CateBean;
import com.xst.dao.CategoryDao;
import com.xst.dao.QueryDao;
import com.xst.dao.ResourcesDao;
import com.xst.dao.daoInterface.QueryDaoInterface;
import com.xst.entity.V9Resources;
import com.xst.page.Page;
import com.xst.page.PageHandler;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by jeff on 16/2/28.
 */

@Controller
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CategoryDao categoryDao;

    @Autowired
    private ResourcesDao resourcesDao;

    @Autowired(required = false)
    @Qualifier("queryDao")
    private QueryDaoInterface queryDao;

    @Autowired
    private PageHandler<V9Resources> pageHandler;

    /**
     * 查看所有资源(第一页)
     */
    @Link(label = "全部课程", family = "CourseController", parent = "")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model){

        List<CateBean> firstCategories = categoryDao.getFirstCategory();
        String hql = "from V9Resources as resources";

        Query query = queryDao.getQuery(hql);

        if (query == null)
            return null;

        Page<V9Resources> page = pageHandler.getPage(1,15,
                V9Resources.class,query);

        model.addAttribute("page", page);
        model.addAttribute("currentPage", 1);
        model.addAttribute("rootCategories", firstCategories);
        return "course/list";
    }

    @Link(label = "全部课程", family = "CourseController", parent = "")
    @RequestMapping(value = "/list/{pageNum}", method = RequestMethod.GET)
    public String listByPage(Model model, @PathVariable("pageNum") int pageNum){

        List<CateBean> firstCategories = categoryDao.getFirstCategory();
        String hql = "from V9Resources as resources";

        Query query = queryDao.getQuery(hql);

        if (query == null)
            return null;

        Page<V9Resources> page = pageHandler.getPage(pageNum,15,
                V9Resources.class,query);

        model.addAttribute("page", page);
        model.addAttribute("currentPage", pageNum);
        model.addAttribute("rootCategories", firstCategories);
        return "course/list";
    }

    /**
     * 查看某个目录,给定目录id
     */
    @Link(label = "查看课程", family = "CourseController", parent = "全部课程")
    @RequestMapping(value = "/view/{id}", method = RequestMethod.GET)
    public String list(Model model, @PathVariable int id){

        List<V9Resources> resourceList = resourcesDao.getResourcesOfLeaf(id);
        List<CateBean> firstCategories = categoryDao.getFirstCategory();
        model.addAttribute("rootCategories", firstCategories);
        model.addAttribute("resourceList", resourceList);
        return "course/list";
    }
}
