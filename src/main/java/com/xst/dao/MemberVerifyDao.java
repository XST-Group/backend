package com.xst.dao;

import com.xst.entity.V9MemberVerify;
import com.xst.entity.V9News;
import com.xst.entity.V9Resources;
import com.xst.page.Page;
import com.xst.page.PageHandler;
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

    @Autowired
    private PageHandler<V9MemberVerify> verifyPage;

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

    /**
     * 分页查询待验证用户
     * @param pageNum
     * @param pageSize
     * @return
     */
    public Page<V9MemberVerify> queryVerifyListByPage(int pageNum,int pageSize){
        String hql="from V9MemberVerify as verify order by verify.regdate desc";
        Query query = query(hql);
        Page<V9MemberVerify> verifypage = verifyPage.getPage(pageNum, pageSize, V9MemberVerify.class, query);
        return verifypage;
    }

    /**
     * 批量删除
     * @param select
     */
    public void deteteAll(int[] select){
        String hql="";
        for(int i=0;i<select.length;i++){
            if(i==0){
                hql="userid="+select[i];
            }
            else{
                hql=hql+" or userid ="+select[i];
            }
        }
        hql="delete from V9MemberVerify where "+ hql;
        Query query = query(hql);
        query.executeUpdate();
    }



}
