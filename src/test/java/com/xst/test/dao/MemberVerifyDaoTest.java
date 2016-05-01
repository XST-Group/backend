package com.xst.test.dao;

import com.xst.dao.MemberVerifyDao;
import com.xst.entity.V9MemberVerify;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.math.BigDecimal;

/**
 * Created by CrazyCodess on 2016/4/1.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration(value = "src/main/webapp")
@ContextHierarchy({
        @ContextConfiguration(name = "parent", locations = "classpath*:conf/spring.xml"),
        @ContextConfiguration(name = "child", locations = "classpath*:conf/springmvc.xml")
})

public class MemberVerifyDaoTest {
    @Autowired
    private MemberVerifyDao verifyDao;
    @Test
    public void testAddMbVerify(){
//        V9MemberVerify verify=new V9MemberVerify("111@qq.com","123456","Qortfg","111",1316700992,"211.102.158.216",
//                "111@qq.com",(byte)10,(short)0,new BigDecimal(20),"",(byte)0,(byte)1,"","","");
//        verifyDao.addMbVerify(verify);
    }

    @Test
    public void testDeleteMbVerify(){
        verifyDao.deleteMbVerify(verifyDao.getById(9));
    }

    @Test
    public void findExistMember(){
        V9MemberVerify verify=verifyDao.getById(1627);
        Assert.assertNotNull(verify);
        Assert.assertEquals(verify.getPassword(),"413945");
    }
}
