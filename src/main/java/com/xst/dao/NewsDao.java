package com.xst.dao;

import com.xst.entity.V9News;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Projections;
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
	/**
	 * 创建Criteria对象
	 * @param c
	 * @return
	 */
	public <T> Criteria getCriteria(Class<T> c) {
		return getSession().createCriteria(c);
	}

	/**
	 * 查出数据表的行数
	 * @param c
	 * @param <T>
     * @return
     */
	public <T> long getTotalRowCount(Class<T> c) {
		return (long) getCriteria(c).setProjection(Projections.rowCount())
				.uniqueResult();
	}
	public V9News getById(int id){
		return get(V9News.class,id);
	}

	/**
	 * 原样全部查出
	 * @param pageSize
	 * @param pageNow
	 * @param c
	 * @param
     * @return
     */
	public  <T> List<T> getPageList(int pageSize, int pageNow, Class<T> c){
		Criteria criteria = getCriteria(c);
		criteria.setFirstResult((pageNow-1)*pageSize);
		criteria.setMaxResults(pageSize);
		List<T> list = criteria.list();
		System.out.println("list" + list.size());
		return list;
	}

	/**
	 * 按照指定的query排序方式查出结果
	 * @param pageSize
	 * @param pageNow
	 * @param query
	 * @param
     * @return
     */
	public  <T> List<T> getPageList(int pageSize, int pageNow, Query query){
		query.setFirstResult((pageNow-1)*pageSize);
		query.setMaxResults(pageSize);
		List<T> list = query.list();
		System.out.println("list" + list.size());
		return list;
	}
	public List<V9News> queryForNewsList(){
		String hql="from V9News as news order by news.listorder desc,news.updatetime desc";
		Query query=query(hql);
		return query.list();
	}

}
