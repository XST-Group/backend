package com.xst.dao;

import com.xst.entity.V9Resources;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sl on 16-5-13.
 */
@Repository("recommendDao")
public class RecommendDao extends BaseDao{

    public List<V9Resources> getByFirstCateId(int firstCateId){

        String hql = "from V9Resources as resources where resources.category1Id=?";

        Query query = query(hql);

        query.setInteger(0,firstCateId);
        return query.list();
    }

}
