package com.xst.controller;

import com.xst.bean.StatusMessage;
import com.xst.dao.GroupDao;
import com.xst.dao.MemberDao;
import com.xst.dao.ResourcesDao;
import com.xst.entity.V9Group;
import com.xst.entity.V9Member;
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
    private GroupDao groupDao;

    @Autowired
    @Qualifier("memberDao")
    private MemberDao memberDao;


    @RequestMapping(value = "/index", method = RequestMethod.GET)

    public String index(Model model , HttpSession session,@ModelAttribute("loginMsg") String loginMsg) {

        Page<V9Resources> resources = resourcesDao.getPageResources(1,8);
        Page<V9Group> groups = groupDao.queryGpListByPage(1,8);

        model.addAttribute("resources", resources);
        model.addAttribute("groups", groups);

        String path=session
                .getServletContext().getRealPath("/usr/local/xst/video");
        model.addAttribute("loginMsg",loginMsg);
        System.out.println("11111111   "+path);
        return "index";
    }




}
