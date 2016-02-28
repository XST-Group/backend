package com.xst.dao.daoInterface;

import org.hibernate.Query;
/**
 * Created by sl on 16-2-28.
 */
public interface QueryDaoInterface {
    Query getQuery(String hql);
}