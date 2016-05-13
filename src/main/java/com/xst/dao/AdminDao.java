package com.xst.dao;

import com.xst.entity.V9Member;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.xst.entity.V9Admin;

import java.util.List;

@Repository("adminDao")
public class AdminDao extends BaseDao {

	public V9Admin getById(int id){
		return get(V9Admin.class, id);
	}

	public V9Admin getByName(String username){
		String hql = "from V9Admin as admin where admin.username=?";
		Query query = query(hql);
		query.setString(0,username);
		List<V9Admin> admin = query.list();
		return admin.get(0);
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
	 * 查询
	 * @param colume
	 * @param value
	 * @return
	 */
	private V9Admin HQuery(String colume , String value){
		String hql = "from V9Admin  where "+colume+"=?";
		Query query = query(hql);
		//query.setString(0, String.valueOf(value));
		query.setString(0, value);
		V9Admin results = (V9Admin) query.uniqueResult();
		return results;
	}
}
