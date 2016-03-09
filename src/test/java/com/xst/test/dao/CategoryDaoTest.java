package com.xst.test.dao;

import com.xst.bean.CateBean;
import com.xst.dao.CategoryDao;
import com.xst.entity.V9Category;
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
        V9Category v9Category = categoryDao.getById((short)3847);
        Assert.assertNotNull(v9Category);
        Assert.assertEquals(v9Category.getCatname(), "1972年纪录片作品-中国");
    }

    @Test
    public void findFather(){
        V9Category category1 = categoryDao.getById((short)3849);
        V9Category v9Category = categoryDao.getById(category1.getParentid());
        Assert.assertNotNull(v9Category);
        Assert.assertEquals(v9Category.getCatname(), "感恩教育");
    }

    @Test
    public void findChild(){
//        V9Category category = categoryDao.getById((short)3849);

        List<CateBean> children = categoryDao.getChildren((short)3849);

        for(CateBean child : children){
            V9Category v9Category = categoryDao.getById(child.getId());
//            System.out.println(child.isExistChild());
//            System.out.println(v9Category);
            Assert.assertNotNull(v9Category);

            Assert.assertEquals(v9Category.getCatname(), "不要让爱你的人失望");
        }



        // TODO 修改后去掉注释
//        Assert.assertEquals(categoryDao.getById(category.getParent()).getChild(), "感恩教育");

    }

    @Test
    public void getFirstCate(){
        List<CateBean> firstCate  = categoryDao.getFirstCategory();
        int count=0;
        for(CateBean cate : firstCate){
            Assert.assertNotNull(cate);
            count++;
            System.out.println("cate.isExistChild() = "+cate.isExistChild());
        }
        System.out.println("一级目录个数: "+count);

    }

}
