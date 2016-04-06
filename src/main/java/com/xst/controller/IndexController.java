package com.xst.controller;

import com.xst.dao.GroupDao;
import com.xst.dao.ResourcesDao;
import com.xst.entity.V9Group;
import com.xst.entity.V9Resources;
import com.xst.page.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xst.entity.V9Admin;
import com.xst.dao.AdminDao;

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private ResourcesDao resourcesDao;

    @Autowired
    private GroupDao groupDao;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model) {
        Page<V9Resources> resources = resourcesDao.getPageResources(1,4);
        Page<V9Group> groups = groupDao.queryGpListByPage(1,4);

        model.addAttribute("resources", resources);
        model.addAttribute("groups", groups);
        return "index";
    }

}
