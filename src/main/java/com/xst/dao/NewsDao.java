package com.xst.dao;

import com.xst.entity.V9News;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author CrazyCodess
 *
 */
 @Repository("newsDao")
public class NewsDao  extends BaseDao {

	public V9News getById(int id){
		return get(V9News.class,id);
	}
	public List<V9News> queryForNewsList(){
		String hql="from V9News as news order by news.listorder desc,news.updatetime desc";
		Query query=query(hql);
		return query.list();
	}
}
