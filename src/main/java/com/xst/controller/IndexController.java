package com.xst.controller;

import com.xst.bean.StatusMessage;
import com.xst.dao.*;
import com.xst.entity.V9Group;
import com.xst.entity.V9Member;
import com.xst.entity.V9News;
import com.xst.entity.V9Resources;
import com.xst.page.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private ResourcesDao resourcesDao;

    @Autowired
    private RecommendDao recommendDao;

    @Autowired
    private GroupDao groupDao;

    @Autowired
    private CategoryDao categoryDao;

    @Autowired
    private NewsDao newsDao;

    @Autowired
    @Qualifier("memberDao")
    private MemberDao memberDao;


    @RequestMapping(value = "/index", method = RequestMethod.GET)

    public String index(Model model , HttpSession session) {

        Page<V9Group> groups = groupDao.queryGpListByPage(1,8);
        Page<V9News> newsPage = newsDao.queryForNewsListByPage(1,15);

        model.addAttribute("groups", groups);
        model.addAttribute("newsPage", newsPage);

        if(session.getAttribute("recommendCourses") == null){
            session.setAttribute("recommendCourses", recommendDao.getByFirstCateId(1));
            session.setAttribute("recommendCourseId", categoryDao.getById((short)1));
            System.out.println("resources get ed");
        }


        return "index";
    }




}
