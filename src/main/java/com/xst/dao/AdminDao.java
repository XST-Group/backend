package com.xst.dao;

import org.springframework.stereotype.Repository;

import com.xst.bean.V9Admin;

@Repository("adminDao")
public class AdminDao extends BaseDao {

	public V9Admin getById(int id){
		return get(V9Admin.class, id);
	}
}
