package com.xst.dao;

import com.xst.bean.V9News;
import org.springframework.stereotype.Repository;

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
}
