package com.xst.dao;

import com.xst.entity.V9Group;
import com.xst.entity.V9News;
import com.xst.page.Page;
import com.xst.page.PageHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by sl on 16-4-1.
 */
@Repository("groupDao")
public class GroupDao extends  BaseDao {

    @Autowired
    private PageHandler<V9Group> pageHandler;
    public V9Group getById(int id){
        return  get(V9Group.class,id);
    }

    public void addGroup(V9Group group){
        save(group);
    }

    public void deleteGroup(V9Group group){
        delete(group);
    }

    public void modifyGroup(V9Group group){
        saveOrUpdate(group);
    }

    /**
     * 分页查询小组列表
     * @param pageNum
     * @param pageSize
     * @return
     */
    public Page<V9Group> queryGpListByPage(int pageNum , int pageSize){
        String hql="from V9Group";
        Page<V9Group> gpPage = pageHandler.getPage(pageNum,pageSize,V9Group.class,query(hql));
        return gpPage;
    }
}
