package com.xst.test.dao;

import com.xst.dao.MemberDao;
import com.xst.entity.V9Admin;
import com.xst.entity.V9Member;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.math.BigDecimal;

/**
 * Created by sl on 16-3-12.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration(value = "src/main/webapp")
@ContextHierarchy({
        @ContextConfiguration(name = "parent", locations = "classpath*:conf/spring.xml"),
        @ContextConfiguration(name = "child", locations = "classpath*:conf/springmvc.xml")
})

public class MemberDaoTest {

    @Autowired
    private MemberDao memberDao;

    @Test
    public void testGetById(){
        V9Member v9Member = memberDao.getById(34);
        Assert.assertNotNull(v9Member);
        Assert.assertEquals(v9Member.getUsername(),"tlyz@0330.com");
    }

    @Test
    public void testAddMember(){
        V9Member member = new V9Member();
        member.setUserid(11111);
        member.setAmount(BigDecimal.valueOf(123));
        member.setEmail("123@123.com");
        member.setAreaid((short) 123);
        member.setContacts("123");
        member.setRegdate(123);
        member.setGroupid((byte) 123);
        member.setEncrypt("123");
        member.setInvoicetitle("1213");
        member.setIslock((byte) 123);
        memberDao.save(member);
    }

    @Test
    public void testGetByName(){
        V9Member member = memberDao.getByName("lqzxxx@123.com");
        org.junit.Assert.assertNotNull(member);
        System.out.println(member.getUsername()+"  "+member.getPassword());
    }

}
