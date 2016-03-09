package com.xst.test.dao;

import com.xst.dao.ResourcesDao;
import com.xst.entity.V9Resources;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

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
    public void testDateTurn(){
        V9Resources v9Resources = resourcesDao.getById(39026);
        Assert.assertNotNull(v9Resources);
        System.out.println(v9Resources.getCreatime());
    }

//    @Test
//    public void testGetResourcesOfLeaf(){
//        List<V9Resources> v9ResourcesList = resourcesDao.getResourcesOfLeaf(2742);
//        Assert.assertNotNull(v9ResourcesList);
//        int count=0;
//        for(V9Resources resources : v9ResourcesList){
//            System.out.println(resources.getId());
//            System.out.println(resources.getTitle());
//            count++;
//        }
//        System.out.println("count = "+count);
//    }


    @Test
    public void testGetBrotherResources(){
        List<V9Resources> resourcesList = resourcesDao.getBrotherResources(31114);
        Assert.assertNotNull(resourcesList);
        int count=0;
        for(V9Resources resources : resourcesList){
            System.out.println(resources.getId());
            System.out.println(resources.getTitle());
            count++;
        }
        System.out.println("count = "+count);

    }


    @Test
    public void testGetPageResources() {

        List<V9Resources> resources = resourcesDao.getPageResources(5,16)
                .getList();
        System.out.println("resources.size() = "+resources.size());
        Assert.assertNotNull(resources);

        for(V9Resources res : resources){
            System.out.println(res.getId());
            System.out.println(res.getTitle());
        }
    }

    @Test
    public void testGetPageResourcesOfLeaf(){
        List<V9Resources> resources = resourcesDao.getPageResourcesOfLeaf(3738,1,15)
                .getList();
        System.out.println("resources.size() = "+resources.size());
        Assert.assertNotNull(resources);

        for(V9Resources res : resources){
            System.out.println(res.getId());
            System.out.println(res.getTitle());
        }
    }

    @Test
    public void testAddResource(){
        V9Resources resources = new V9Resources();
        resources.setId(3);
        resources.setTitle("test");
        resourcesDao.addResource(resources);
    }

    @Test
    public void testDeleteResource(){
        resourcesDao.delete(resourcesDao.getById(3));

    }

    @Test
    public void testModifyResource(){
        V9Resources resources = resourcesDao.getById(3);
        resources.setTitle("test2");
        resourcesDao.saveOrUpdate(resources);

    }


}
