package com.xst.dao;

import com.xst.bean.CateBean;
import com.xst.entity.V9Category;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by sl on 16-2-24.
 */
@Repository("categoryDao")
public class CategoryDao extends BaseDao{

    private V9Category v9Category;


    public V9Category getById(short id){
        return get(V9Category.class,id);
    }


    /**
     * 获取儿子节点，不含后代子孙
     * @param id
     * @return
     */
    public List<CateBean> getChildren(short id){

        List<CateBean> children = new ArrayList<>();

        String[] childrenID = this.getChildrenString(id);

        for(String childID : childrenID){
            CateBean cateBean = new CateBean();

            short childIDTurn = new Short(childID);
            System.out.println(childIDTurn);

            cateBean.setId(childIDTurn);
            cateBean.setName(this.getById(childIDTurn).getCatname());

            //判断该child是否有子结点（判断arrchildid中除了自己外是否还有其他结点）
            cateBean.setIsExistChild(this.getChildrenString(childIDTurn).length!=1);
            children.add(cateBean);
        }

        return children;
    }


    /**
     * 获取一级目录
     */
    public List<CateBean> getFirstCategory(){

        List<CateBean> children = new ArrayList<>();

        String hql = "from V9Category as cate where cate.parentid=?";
        Query query = query(hql);
        query.setString(0, "0");
        List<V9Category> results = query.list();

        for(V9Category res : results){
            CateBean cateBean = new CateBean();
            cateBean.setId(res.getCatid());
            cateBean.setName(res.getCatname());
            cateBean.setIsExistChild(this.getChildrenString(res.getCatid()).length!=1);
            children.add(cateBean);
        }

        return children;
    }


    /**
     * 获取arrchildid的String数组
     * @return
     */
    private String[] getChildrenString(short id){
        v9Category = this.getById(id);
        String childrenString = v9Category.getArrchildid();

        String[] childrenID = childrenString.split(",");

        return childrenID;
    }



}
