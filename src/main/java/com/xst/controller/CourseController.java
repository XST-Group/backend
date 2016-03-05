package com.xst.controller;

import com.xst.annotations.Link;
import com.xst.bean.CateBean;
import com.xst.dao.CategoryDao;
import com.xst.dao.ResourcesDao;
import com.xst.entity.V9Resources;
import com.xst.page.Page;
import com.xst.page.PageHandler;
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


    @Link(label = "全部课程", family = "CourseController", parent = "")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String listByPage(Model model, String page){
        int pageNum = page == null ? 1 : Integer.valueOf(page);
        System.out.println(pageNum);

        List<CateBean> firstCategories = categoryDao.getFirstCategory();

        Page<V9Resources> pageCourse = resourcesDao.getPageResources(pageNum,15);

        model.addAttribute("page", pageCourse);
        model.addAttribute("currentPage", pageNum);
        model.addAttribute("rootCategories", firstCategories);
        return "course/list";
    }

    @RequestMapping(value = "/view/{id}", method = RequestMethod.GET)
    public String list(Model model, @PathVariable int id, String page){
        int pageNum = page == null ? 1 : Integer.valueOf(page);
        System.out.println(pageNum);

        Page<V9Resources> pageCourse = resourcesDao.getPageResourcesOfLeaf(id, pageNum, 15);
        List<CateBean> firstCategories = categoryDao.getFirstCategory();

        model.addAttribute("currentPage", pageNum);
        model.addAttribute("rootCategories", firstCategories);
        model.addAttribute("courseId", id);
        model.addAttribute("page", pageCourse);

        return "course/list";
    }
}
