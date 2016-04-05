package com.xst.test.dao;

import com.xst.dao.GroupDao;
import com.xst.dao.NewsDao;
import com.xst.entity.V9Group;
import com.xst.entity.V9News;
import com.xst.page.Page;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.sql.Timestamp;

/**
 * Created by CrazyCodess on 2016/4/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration(value = "src/main/webapp")
@ContextHierarchy({
        @ContextConfiguration(name = "parent", locations = "classpath:conf/spring.xml"),
        @ContextConfiguration(name = "child", locations = "classpath:conf/springmvc.xml")
})
public class GroupDaoTest {
    @Autowired
    private GroupDao groupDao;

    @Test
    public void findExistNews(){
        V9Group group=groupDao.getById(1);
        Assert.assertNotNull(group);
    }

    @Test
    public void testAddGroup(){
        V9Group group=new V9Group("分组2",new Integer(123456),new Timestamp(System.currentTimeMillis()),"x","www.baidu.com");
        groupDao.addGroup(group);
    }

    @Test
    public void testDeleteGroup(){
        groupDao.deleteGroup(groupDao.getById(1));
    }

    @Test
    public void testModifyGroup(){
        V9Group group=groupDao.getById(1);
        group.setType("分组三");
        groupDao.modifyGroup(group);
    }

    @Test
    public void testGueryGpListByPage(){
        Page<V9Group> groupPage = groupDao.queryGpListByPage(1,10);
        Assert.assertNotNull(groupPage);
    }

}
