package com.xst.dao;

import com.xst.entity.V9News;
import com.xst.page.PageHandler;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 
 * @author CrazyCodess
 *
 */
 @Repository("newsDao")
public class NewsDao  extends BaseDao {
	@Autowired
	private PageHandler<V9News> newsPageHandler;

	/**
	 * 根据新闻Id返回新闻类
	 * @param id
	 * @return
     */
	public V9News getById(int id){
		return get(V9News.class,id);
	}
	public List<V9News> queryForNewsList(Query query){
		return query.list();
	}


}
