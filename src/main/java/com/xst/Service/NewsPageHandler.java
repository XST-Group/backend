package com.xst.Service;

import com.xst.bean.PageBean;
import com.xst.dao.NewsDao;
import com.xst.entity.V9News;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by CrazyCodess on 2016/2/28.
 */
@Service
public class NewsPageHandler {
    @Autowired
    private NewsDao newsDao;
    @Autowired
    private PageHandler<V9News> newsPageHandler;
    public PageBean<V9News> getNews(int pageNow,int pageSize){
        //按listorder和updatetime递减排序
        String hql="from V9News as news where news.thumb!='' order by news.listorder desc,news.updatetime desc ";
        Query query=newsDao.query(hql);
        PageBean<V9News> newsPageBean=newsPageHandler.getPage(pageNow,pageSize,V9News.class,query);
        return newsPageBean;
    }

}
