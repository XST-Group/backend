package com.xst.dao;

import com.xst.entity.V9Group;
import com.xst.entity.V9News;
import com.xst.page.Page;
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

	/**
	 * 查询所有的news
	 * @return
     */
	public List<V9News> queryForNewsList(){
		String hql="from V9News as news order by news.listorder desc,news.updatetime desc";
		Query query = query(hql);
		return query.list();
	}

	/**
	 * 查询所有的news,分页
	 * @param pageNum 页码
	 * @param pageSize 页框
     * @return
     */
	public Page<V9News> queryForNewsListByPage(int pageNum , int pageSize) {
		String hql="from V9News as news order by news.listorder desc,news.updatetime desc ";
		Query query = query(hql);
		Page<V9News> newsPage = newsPageHandler.getPage(pageNum, pageSize, V9News.class, query);
		return newsPage;
	}

	/**
	 * 从表中查前5条News
	 * @return
     */
	public Page<V9News> queryFirstFiveNews() {
		String hql="from V9News as news where news.thumb!='' order by news.listorder desc,news.updatetime desc ";
		Query query = query(hql);
		query.setFirstResult(1);
		query.setMaxResults(5);
		Page<V9News> newsPage = newsPageHandler.getPage(1,5,V9News.class,query);
		return newsPage;
	}

	/**
	 * 增加News
	 * @param news
     */
	public void addNews(V9News news){
		//save(news.getV9NewsData());
		save(news);

		//save(news.getV9NewsData());
	}

	/**
	 * 删除News
	 * @param news
     */
	public void deleteNews(V9News news){
		delete(news);
	}

	/**
	 * 修改News
	 * @param news
     */
	public void modifyNews(V9News news){
		saveOrUpdate(news);
	}

	/**
	 * 分组查询
	 * @param groupId
	 * @param pageNum
	 * @param pageSize
     * @return
     */
	public Page<V9News> queryGroupNews(int groupId,int pageNum , int pageSize){
		String hql="from V9News as news where news.arr_group_id like ?";
		Query  query = query(hql);
		query.setString(0,"%,"+groupId+",%");
		Page<V9News> newsPage = newsPageHandler.getPage(pageNum, pageSize, V9News.class, query);
		return newsPage;
	}

	/**
	 * 按分类分页查询
	 * @param type
	 * @param pageNum
	 * @param pageSize
     * @return
     */
	public Page<V9News> queryForTNewsListByPage(String type,int pageNum , int pageSize){
		String hql="from V9News as news where news.type=? order by news.listorder desc,news.updatetime desc ";
		Query query = query(hql);
		query.setString(0,type);
		Page<V9News> newsPage = newsPageHandler.getPage(pageNum, pageSize, V9News.class, query);
		return newsPage;
	}
}
