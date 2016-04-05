package com.xst.test.dao;

import com.xst.dao.NewsDao;
import com.xst.entity.V9NewsData;
import com.xst.page.Page;
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
    @Test
    public void testAddNews(){
        V9NewsData newsData=new V9NewsData();
        V9News news=new V9News((short)1584,(short)0,"分河北高考改革2018启动：文理不分科",""
                ,"http://e.36krcnd.com/nil_class/bfbdbaca-8213-48e5-ad13-9aea66c50b10/QQ20160301-12.png!slider"
        ,"","高考",false,"",(byte)8,(byte)1,false,false,"",1416498100,1429505965,newsData,",1,5,6,");
        newsDao.addNews(news);
    }
    @Test
    public void testDeleteNews(){
        newsDao.deleteNews(newsDao.getById(3));
    }
    @Test
    public void testModifyNews(){
        V9NewsData newsData=new V9NewsData();
        V9News news=new V9News((short)1584,(short)0,"高考取消加分项",""
                ,"http://e.36krcnd.com/nil_class/bfbdbaca-8213-48e5-ad13-9aea66c50b10/QQ20160301-12.png!slider"
                ,"","高考",false,"",(byte)8,(byte)1,false,false,"",1416498100,1429505965,newsData,",1,3,5,");
        newsDao.modifyNews(news);
    }
    @Test
    public void testQueryGroupNews(){
        Page<V9News> groupNews = newsDao.queryGroupNews(1,1,10);
        Assert.assertNotNull(groupNews);
        System.out.println(groupNews);
    }
}
