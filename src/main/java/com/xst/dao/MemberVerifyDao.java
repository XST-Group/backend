package com.xst.dao;

import com.xst.entity.V9MemberVerify;
import com.xst.entity.V9Resources;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by CrazyCodess on 2016/4/1.
 */
@Repository("memberVerifyDao")
public class MemberVerifyDao extends BaseDao {

    @Autowired
    @Qualifier("memberDao")
    private MemberDao memberDao;


    /**
     * 增加MemberVerify
     * @param verify
     */
    public void addMbVerify(V9MemberVerify verify){
        save(verify);
    }

    /**
     * 删除MemberVerify
     * @param verify
     */
    public void deleteMbVerify(V9MemberVerify verify){
        delete(verify);
    }

    /**
     * 根据主键userId返回MemberVerify类
     * @param userid
     * @return
     */
    public V9MemberVerify getById(int userid){
        return get(V9MemberVerify.class,userid);
    }


    /**
     * 判断邮箱是否存在，V9MemberVerify
     * @param email
     * @return
     */
    public boolean isEmailExit(String email){

        if(HQuery("email",email)==null && !memberDao.isEmailExit(email)){
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
    private List<V9MemberVerify> HQuery(String colume , String value){
        String hql = "from V9MemberVerify as member where member."+colume+"=?";
        Query query = query(hql);
        query.setString(0, String.valueOf(value));
        List<V9MemberVerify> results = query.list();
        return results;
    }


}
