package com.xst.controller;

import com.xst.dao.ResourcesDao;
import com.xst.entity.V9Resources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    @ResponseBody
    @RequestMapping(value = "/{id}.json" , method = RequestMethod.GET)
    public List<V9Resources> getResourcesOfLeaf(@PathVariable("id") int id){

        return resourcesDao.getResourcesOfLeaf(id);
    }

}
