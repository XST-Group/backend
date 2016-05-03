package com.xst.test.dao;

import com.xst.dao.MemberDao;
import com.xst.entity.V9Admin;
import com.xst.entity.V9Member;
import com.xst.page.Page;
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

        member.setUsername("张三"+System.currentTimeMillis());
        member.setNickname("小张");
        member.setPassword("123456");
        //member.setUserid(11111);
        member.setAmount(BigDecimal.valueOf(123));
        member.setEmail("123@123.com");
        member.setAreaid((short) 123);
        member.setContacts("123");
        member.setRegdate((int)(System.currentTimeMillis()/1000));
        member.setGroupid((byte) 123);
        member.setEncrypt("123");
        member.setInvoicetitle("1213");
        member.setIslock((byte) 123);
        member.setVerify("0");
        member.setSchoolAddress("河海大学");
        memberDao.save(member);
    }

    @Test
    public void testGetByName(){
        V9Member member = memberDao.getByName("lqzxxx@123.com");
        org.junit.Assert.assertNotNull(member);
        System.out.println(member.getUsername()+"  "+member.getPassword());
    }

    @Test
    public void testQueryForMemList(){
        Page<V9Member> memberPage=memberDao.queryForMemList(1,5,1);
        Assert.assertNotNull(memberPage);
        for(int i=0;i<memberPage.getList().size();i++){
            System.out.println(memberPage.getList().get(i));
        }

    }

    @Test
    public void testAcceptMember(){
            memberDao.acceptMember(new int[]{4831,4832});

    }

    @Test
    public void testRefuseMember(){

        memberDao.refuseMember(new int[]{4834,4833});
    }
}
