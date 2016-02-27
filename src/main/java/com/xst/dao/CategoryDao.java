package com.xst.dao;

import com.xst.bean.V9Category;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by sl on 16-2-24.
 */

@Repository("categoryDao")
public class CategoryDao extends BaseDao{

    public V9Category getById(int id){
        return get(V9Category.class,id);
    }

    /**
     * 获取三级目录
     */
    public List<V9Category> getCategory(String id){

        String hql = "from V9Category as cate where cate.parentid=?";
        Query query = query(hql);
        query.setString(0,id);
//        List<V9Category> firstCategories = query.list();
        return query.list();
    }


}
