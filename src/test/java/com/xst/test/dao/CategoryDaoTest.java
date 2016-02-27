package com.xst.test.dao;

import com.xst.bean.V9Category;
import com.xst.dao.CategoryDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * Created by sl on 16-2-24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration(value = "src/main/webapp")
@ContextHierarchy({
        @ContextConfiguration(name = "parent", locations = "classpath*:conf/spring.xml"),
        @ContextConfiguration(name = "child", locations = "classpath*:conf/springmvc.xml")
})

public class CategoryDaoTest {

    @Autowired
    private CategoryDao categoryDao;

    @Test
    public void findExistCat(){
        V9Category v9Category = categoryDao.getById(3847);
        Assert.assertNotNull(v9Category);
        Assert.assertEquals(v9Category.getCatname(), "1972年纪录片作品-中国");
    }

    @Test
    public void findFather(){
        V9Category category1 = categoryDao.getById(3849);
        V9Category v9Category = categoryDao.getById(category1.getParentid());
        Assert.assertNotNull(v9Category);
        Assert.assertEquals(v9Category.getCatname(), "感恩教育");
    }

    @Test
    public void findChild(){
        V9Category category1 = categoryDao.getById(3849);
        V9Category v9Category = categoryDao.getById(category1.getChild());
        Assert.assertNotNull(v9Category);
        Assert.assertEquals(v9Category.getCatname(), "不要让爱你的人失望");

        // TODO 修改后去掉注释
//        Assert.assertEquals(category.getParent().getCatename(), "感恩教育");

    }

    @Test
    public void getFirstCate(){
        List<V9Category> firstCate  = categoryDao.getCategory("");
        int count=0;
        for(V9Category cate : firstCate){
            Assert.assertNotNull(cate);
            count++;
        }
        System.out.println("test: "+count);

    }

}
