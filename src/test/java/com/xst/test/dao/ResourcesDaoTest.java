package com.xst.test.dao;

import com.xst.bean.V9Resources;
import com.xst.dao.ResourcesDao;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by sl on 16-2-26.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration(value = "src/main/webapp")
@ContextHierarchy({
        @ContextConfiguration(name = "parent", locations = "classpath:conf/spring.xml"),
        @ContextConfiguration(name = "child", locations = "classpath:conf/springmvc.xml")
})

public class ResourcesDaoTest {

    @Autowired
    private ResourcesDao resourcesDao;

    @Test
    public void dateTurn(){
//        V9Category v9Category = categoryDao.getById(3847);
//        Assert.assertNotNull(v9Category);
//        Assert.assertEquals(v9Category.getCatname(), "1972年纪录片作品-中国");
        V9Resources v9Resources = resourcesDao.getById(39026);
        Assert.assertNotNull(v9Resources);
//        Assert.assertEquals(v9Resources.getCreatime(),"");
    }

}
