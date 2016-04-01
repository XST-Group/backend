package com.xst.dao;

import com.xst.entity.V9Member;
import org.springframework.stereotype.Repository;

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

}
