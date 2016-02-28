package com.xst.controller;

import com.xst.dao.QueryDao;
import com.xst.dao.ResourcesDao;
import com.xst.dao.daoInterface.QueryDaoInterface;
import com.xst.entity.V9Resources;
import com.xst.page.Page;
import com.xst.page.PageHandler;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
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
    private PageHandler<V9Resources> pageHandler;


    @Autowired
    private ResourcesDao resourcesDao;

    @Autowired(required = false)
    @Qualifier("queryDao")
    private QueryDaoInterface queryDao;


    @ResponseBody
    @RequestMapping(value = "/{id}" , method = RequestMethod.GET)
    public List<V9Resources> getResourcesOfLeaf(@PathVariable("id") int id){

        return resourcesDao.getResourcesOfLeaf(id);
    }


    /**
     * 分页查询所有资源
     */
    @Transactional(propagation= Propagation.REQUIRED,rollbackFor=Throwable.class)
    @ResponseBody
    @RequestMapping(value = "/page/{pageNum}/{pageSize}" , method = RequestMethod.GET)
    public Page<V9Resources> getPageResources(@PathVariable("pageNum") int pageNum,
                                              @PathVariable("pageSize") int pageSize) {

        String hql = "from V9Resources as resources";

        System.out.println(queryDao);
        Query query = queryDao.getQuery(hql);

        if (query == null)
            return null;

        Page<V9Resources> page = pageHandler.getPage(pageNum,pageSize,
                V9Resources.class,query);

        return page;
    }


}
