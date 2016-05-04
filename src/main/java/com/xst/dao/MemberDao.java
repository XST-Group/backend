package com.xst.dao;

import com.xst.entity.V9Member;
import com.xst.entity.V9MemberVerify;
import com.xst.page.Page;
import com.xst.page.PageHandler;
import org.hibernate.CacheMode;
import org.hibernate.Query;
import org.hibernate.ScrollMode;
import org.hibernate.ScrollableResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sl on 16-3-12.
 */
@Repository("memberDao")
public class MemberDao extends BaseDao{

    @Autowired
    private PageHandler<V9Member> memberPage;

    public V9Member getById(int userid){
        return get(V9Member.class,userid);
    }

    public void addMember(V9Member member){
        save(member);
    }

    public void addMember(String username,String email,String password){
        V9Member member=new V9Member();
        member.setUsername(username);
        member.setEmail(email);
        member.setPassword(password);
        addMember(member);

    }

    public V9Member getByName(String username){
        String hql = "from V9Member as admin where admin.username=?";
        Query query = query(hql);
        query.setString(0,username);
        List<V9Member> member = query.list();
        return member.get(0);
    }

    /**
     * 判断用户名是否存在
     * @param username
     * @return
     */
    public boolean isUsernameExit(String username){
        if(HQuery("username",username) == null){
            return false;
        }

        return true;
    }

    /**
     * 判断邮箱是否存在，V9Member
     * @param email
     * @return
     */
    public boolean isEmailExit(String email){

        if(HQuery("email",email) == null){
            return false;
        }

        return true;

    }


    /**
     * 查询
     * @param colume
     * @param value
     * @return
     */
    private V9Member HQuery(String colume , String value){
        String hql = "from V9Member  where "+colume+"=?";
        Query query = query(hql);
        //query.setString(0, String.valueOf(value));
        query.setString(0, value);
        V9Member results = (V9Member) query.uniqueResult();
        return results;
    }

    /**
     * 分页查询用户列表
     * @param pageNum
     * @param pageSize
     * @param verify
     * @return
     */
    public Page<V9Member> queryForMemList(int pageNum , int pageSize,int verify){
        String hql="from V9Member  where verify=? order by regdate desc ";// as member where member.verify=? order by member.regdate desc
        Query query = query(hql);
        query.setString(0,String.valueOf(verify).trim());
        System.out.println(query.getQueryString());
        Page<V9Member> memberpage = memberPage.getPage(pageNum, pageSize, V9Member.class, query);
        return memberpage;
    }

    public void acceptMember(int[] userid){
        String hql="";
        for(int i=0;i<userid.length;i++){
            if(i==0){
                hql="userid="+userid[i];
            }
            else{
                hql=hql+" or userid ="+userid[i];
            }
        }

        query("update V9Member set verify=1 where "+hql).executeUpdate();
    }

    public void refuseMember(int[] userid){
        String hql="";
        for(int i=0;i<userid.length;i++){
            if(i==0){
                hql="userid="+userid[i];
            }
            else{
                hql=hql+" or userid ="+userid[i];
            }
        }
        query("delete from  V9Member where "+hql).executeUpdate();
    }

}
