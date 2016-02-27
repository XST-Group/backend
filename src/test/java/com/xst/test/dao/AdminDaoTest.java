package com.xst.test.dao;

import com.xst.entity.V9Admin;
import com.xst.dao.AdminDao;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by jeff on 16/2/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration(value = "src/main/webapp")
@ContextHierarchy({
        @ContextConfiguration(name = "parent", locations = "classpath:conf/spring.xml"),
        @ContextConfiguration(name = "child", locations = "classpath:conf/springmvc.xml")
})

public class AdminDaoTest {
    @Autowired
    private AdminDao adminDao;

    @Test
    public void findExistAdmin() {
        V9Admin admin = adminDao.getById(1);
        Assert.assertNotNull(admin);
        Assert.assertEquals(admin.getV9AdminRole().getDescription(), "超级管理员");
    }
}
