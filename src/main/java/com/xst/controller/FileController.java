package com.xst.controller;

import com.xst.dao.FileDao;
import com.xst.dao.ResourcesDao;
import com.xst.entity.V9Resources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;


/**
 * Created by sl on 16-4-30.
 */
@Controller
@RequestMapping("/file")
public class FileController {

    @Autowired
    @Qualifier("fileDao")
    FileDao fileDao;

    @Autowired
    @Qualifier("resourcesDao")
    ResourcesDao resourcesDao;


    @RequestMapping(value = "/video/{resourceId}" , method = RequestMethod.GET)
    public void readVideo(@PathVariable("resourceId")int resourceId , HttpServletResponse response){

        fileDao.readVideo(resourcesDao.getById(resourceId).getUrl(),response);
        
    }




}
