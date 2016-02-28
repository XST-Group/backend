package com.xst.controller;

import com.xst.annotations.Link;
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
 * Created by sl on 16-2-28.
 */
@Controller
@RequestMapping("/resources")
public class ResourcesController {

    @Autowired
    private ResourcesDao resourcesDao;

    @Link(label = "查看课程", family = "CourseController", parent = "全部课程")
    @RequestMapping(value = "/{id}" , method = RequestMethod.GET)
    public String find(Model model, @PathVariable("id") int id){

        V9Resources resource = resourcesDao.getById(id);
        model.addAttribute("resource", resource);

        return "resource/view";
    }

//    @ResponseBody


}