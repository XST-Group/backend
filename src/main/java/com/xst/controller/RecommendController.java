package com.xst.controller;

import com.xst.dao.CategoryDao;
import com.xst.dao.RecommendDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;


/**
 * Created by sl on 16-5-13.
 */
@Controller
@RequestMapping("/recommend")
public class RecommendController{

    @Autowired
    private RecommendDao recommendDao;

    @Autowired
    private CategoryDao categoryDao;

    @RequestMapping("/course/{cateid}")
    public String course(@PathVariable("cateid") int cateid , HttpSession session){


        session.setAttribute("recommendCourses", recommendDao.getByFirstCateId(cateid));
        session.setAttribute("recommendCourseId", categoryDao.getById((short)cateid));

        return "redirect:/index";
    }


}
