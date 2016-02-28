package com.xst.dao;

import com.xst.entity.V9Resources;
import org.springframework.stereotype.Repository;

/**
 * Created by sl on 16-2-25.
 */
@Repository("resourcesDao")
public class ResourcesDao extends BaseDao {

    public V9Resources getById(int id){
        return get(V9Resources.class,id);
    }

//
}
