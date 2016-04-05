package com.xst.dao;

import com.xst.entity.V9Group;
import org.springframework.stereotype.Repository;

/**
 * Created by sl on 16-4-1.
 */
@Repository("groupDao")
public class GroupDao extends  BaseDao {


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

}
