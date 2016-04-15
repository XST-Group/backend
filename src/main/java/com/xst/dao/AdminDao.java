package com.xst.dao;

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

}
