package com.xst.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xst.entity.V9Admin;
import com.xst.dao.AdminDao;

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private AdminDao adminDao;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String test() {
        return "index";
    }

}
