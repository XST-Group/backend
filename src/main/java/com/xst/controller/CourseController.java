package com.xst.controller;

import com.xst.annotations.Link;
import com.xst.bean.CateBean;
import com.xst.dao.CategoryDao;
import com.xst.dao.ResourcesDao;
import com.xst.entity.V9Resources;
import org.springframework.beans.factory.annotation.Autowired;
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
    public String list(Model model){

        List<CateBean> firstCategories = categoryDao.getFirstCategory();
        model.addAttribute("rootCategories", firstCategories);
        return "course/list";
    }

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
