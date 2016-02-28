package com.xst.dao;

/**
 * Created by sl on 16-2-28.
 */
import com.xst.dao.daoInterface.QueryDaoInterface;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

@Repository("queryDao")
public class QueryDao extends BaseDao implements QueryDaoInterface{

    public QueryDao() {
        System.out.println("111111111111111111111");
    }

    @Override
    public Query getQuery(String hql){
        return query(hql);
    }

}