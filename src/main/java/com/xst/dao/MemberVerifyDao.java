package com.xst.dao;

import com.xst.entity.V9MemberVerify;
import org.springframework.stereotype.Repository;

/**
 * Created by CrazyCodess on 2016/4/1.
 */
@Repository("memberVerifyDao")
public class MemberVerifyDao extends BaseDao {

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

}
