package com.xst.Service;

import com.xst.bean.PageBean;
import com.xst.dao.NewsDao;
import org.hibernate.Query;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by CrazyCodess on 2016/2/28.
 */
@Service
public class PageHandler<T> {

    @Autowired
    private NewsDao newsDao;

    public PageBean<T> getPage(int pageNow,int pageSize,Class<T> c,Query query){
        PageBean<T> pageBean=initPage(pageNow,pageSize,c);
        if(pageBean==null)return null;
        List<T> list=newsDao.getPageList(pageSize,pageNow,query);
        pageBean.setList(list);
        return pageBean;
    }

    public PageBean<T> initPage(int pageNow,int pageSize,Class<T> c){
        // 获取总行数
        long totalRowCount = newsDao.getTotalRowCount(c);
        if (totalRowCount == 0)
            return null;
        if (pageSize == 0)
            return null;
		/*
		 * 计算页码数
		 */
        long temp = totalRowCount / pageSize;
        long totalPageCount = (totalRowCount % pageSize) == 0 ? temp : temp + 1;
        if (pageNow > totalPageCount) {
            pageNow = 1;
        }
        PageBean<T> pageBean = new PageBean<T>();
        pageBean.setPageNow(pageNow);
        pageBean.setTotalPageCount(totalPageCount);
        return pageBean;
    }

}
