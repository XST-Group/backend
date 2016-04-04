package com.xst.controller;


import com.xst.annotations.Link;
import com.xst.bean.CateBean;
import com.xst.dao.CategoryDao;
import com.xst.dao.ResourcesDao;
import com.xst.entity.V9Resources;
import com.xst.page.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Method;
import java.util.List;


/**
 * Created by sl on 16-2-28.
 */
@Controller
@RequestMapping("/resources")
public class ResourcesController {


    @Autowired
    @Qualifier("resourcesDao")
    private ResourcesDao resourcesDao;



    /**
     * 查看某一个课程(给定Id)
     */

    @Link(label = "查看课程", family = "CourseController", parent = "全部课程")
    @RequestMapping(value = "/{id}" , method = RequestMethod.GET)
    public String find(Model model, @PathVariable("id") int id){

        V9Resources resource = resourcesDao.getById(id);
        resourcesDao.addHitsByOne(resource);
        List<V9Resources> siblings = resourcesDao.getBrotherResources(id);
        System.out.println(siblings.size());
        model.addAttribute("resource", resource);
        model.addAttribute("siblings", siblings);

        return "resource/view";
    }


    /**
     * 分页查询所有资源
     */
    @ResponseBody
    @RequestMapping(value = "/page/{pageNum}/{pageSize}" , method = RequestMethod.GET)
    public Page<V9Resources> getPageResources(@PathVariable("pageNum") int pageNum,
                                              @PathVariable("pageSize") int pageSize) {

        return resourcesDao.getPageResources(pageNum,pageSize);
    }


    /**
     * 查询兄弟结点的资源
     */
    @ResponseBody
    @RequestMapping(value = "/brother/{id}" , method = RequestMethod.GET)
    public List<V9Resources> getBrotherResources(@PathVariable("id") int id){
        return resourcesDao.getBrotherResources(id);
    }



    /**
     * 分页查询 叶子结点下的所有资源
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/pageleaf/{id}/{pageNum}/{pageSize}" ,
            method = RequestMethod.GET)
    public Page<V9Resources> getPageResourcesOfLeaf(@PathVariable("id") int id,
                                                    @PathVariable("pageNum") int pageNum,
                                                    @PathVariable("pageSize") int pageSize){
        return resourcesDao.getPageResourcesOfLeaf(id,pageNum,pageSize);
    }

}