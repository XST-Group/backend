package com.xst.dao;

import com.xst.entity.V9Member;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sl on 16-3-12.
 */
@Repository("memberDao")
public class MemberDao extends BaseDao{

    public V9Member getById(int userid){
        return get(V9Member.class,userid);
    }

    public void addMember(V9Member member){
        save(member);
    }


    public V9Member getByName(String username){
        String hql = "from V9Member as admin where admin.username=?";
        Query query = query(hql);
        query.setString(0,username);
        List<V9Member> member = query.list();
        return member.get(0);
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
    private List<V9Member> HQuery(String colume , String value){
        String hql = "from V9Member as member where member."+colume+"=?";
        Query query = query(hql);
        query.setString(0, String.valueOf(value));
        List<V9Member> results = query.list();
        return results;
    }

}
