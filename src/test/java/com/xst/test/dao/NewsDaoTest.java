package com.xst.test.dao;

import com.xst.dao.NewsDao;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import com.xst.entity.V9News;
/**
 * Created by Admin on 2016/2/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration(value = "src/main/webapp")
@ContextHierarchy({
        @ContextConfiguration(name = "parent", locations = "classpath:conf/spring.xml"),
        @ContextConfiguration(name = "child", locations = "classpath:conf/springmvc.xml")
})
public class NewsDaoTest {
    @Autowired
    private NewsDao newsDao;

    @Test
    public void findExistNews(){
        V9News news=newsDao.getById(1);
        Assert.assertNotNull(news);
    }

    @Test
    public void findNotExistNews(){
        V9News news=newsDao.getById(1000);
        Assert.assertNull(news);
    }

    @Test
    public void relationBetweenNewsAndData() {
        V9News news = newsDao.getById(1);
        // TODO 这个测试等修改完再把注释去掉
         Assert.assertNotNull(news.getV9NewsData().getContent());
         Assert.assertEquals(news.getV9NewsData().getMaxcharperpage(), 10000);
    }
}
