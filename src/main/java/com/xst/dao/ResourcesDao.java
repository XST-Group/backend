package com.xst.dao;

import com.xst.entity.V9Resources;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sl on 16-2-25.
 */
@Repository("resourcesDao")
public class ResourcesDao extends BaseDao {


    public V9Resources getById(int id){
        return get(V9Resources.class,id);
    }

    /**
     * 获取叶子结点下的所有资源
     */
    public List<V9Resources> getResourcesOfLeaf(int id){

        List<V9Resources> resourcesList = null;

        if(this.HQuery("category4Id", id).size() != 0){

            resourcesList = this.HQuery("category4Id", id);

        }else if(this.HQuery("category3Id", id).size() != 0){

            resourcesList = this.HQuery("category3Id", id);

        }else if(this.HQuery("category2Id", id).size() != 0){

            resourcesList = this.HQuery("category2Id", id);

        }else if(this.HQuery("category1Id", id).size() != 0){

            resourcesList = this.HQuery("category1Id", id);

        }

        return resourcesList;
    }


    /**
     * 查询
     * @param colume
     * @param value
     * @return
     */
    private List<V9Resources> HQuery(String colume , int value){
        String hql = "from V9Resources as resources where resources."+colume+"=?";
        Query query = query(hql);
        query.setString(0, String.valueOf(value));
        List<V9Resources> results = query.list();
        return results;
    }

}
