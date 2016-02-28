package com.xst.dao;

import com.xst.entity.V9Category;
import com.xst.entity.V9Resources;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sl on 16-2-25.
 */
@Repository("resourcesDao")
public class ResourcesDao extends BaseDao {


    @Autowired
    private CategoryDao categoryDao;

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
     *查询这个资源的父目录(最近的父目录)下的其他资源(除了它自己)
     * @param id
     * @return
     */
    public List<V9Resources> getBrotherResources(int id){

        V9Resources self = this.getById(id);

        int parentid;

        if(self.getCategory4Id() != null){
            parentid = self.getCategory4Id();
        }else if(self.getCategory3Id() != null){
            parentid = self.getCategory3Id();
        }else if(self.getCategory2Id() != null){
            parentid = self.getCategory2Id();
        }else if(self.getCategory1Id() != null){
            parentid = self.getCategory1Id();
        }else{
            return null;
        }

        List<V9Resources> brothers = this.getResourcesOfLeaf(parentid);

        int indexToRemove = -1;

        for(V9Resources resources : brothers){
            if(resources.getId() == id){
                indexToRemove = brothers.indexOf(resources);
                break;
            }
        }

        if(indexToRemove != -1)
            brothers.remove(indexToRemove);

        return brothers;
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
