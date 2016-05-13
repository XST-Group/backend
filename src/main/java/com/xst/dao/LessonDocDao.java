package com.xst.dao;

import com.xst.entity.LessonDocument;
import com.xst.entity.V9News;
import com.xst.page.Page;
import com.xst.page.PageHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by CrazyCodess on 2016/5/13.
 */
@Repository("lessonDocDao")
public class LessonDocDao extends  BaseDao {

    @Autowired
    private PageHandler<LessonDocument> docPageHandler;

    public LessonDocument getById(int id){
        return  get(LessonDocument.class,id);
    }

    public void saveLessonDoc(LessonDocument LessonDoc){
        save(LessonDoc);
    }

    public void deleteLessonDoc(LessonDocument LessonDoc){
        delete(LessonDoc);
    }

    public void updateLessonDoc(LessonDocument LessonDoc){
        saveOrUpdate(LessonDoc);
    }

    /**
     * 根据id分页查询
     * @param pageNum
     * @param pageSize
     * @param id
     * @return
     */
    public Page<LessonDocument> queryDocPage(int pageNum , int pageSize,int id){

        String hql="from  LessonDocument where ";
        if(id<=4){
            hql=hql+"category1Id="+id;
        }
        else{
            hql=hql+"category2Id="+id;
        }
        Page<LessonDocument> docPage = docPageHandler.getPage(pageNum, pageSize, LessonDocument.class, query(hql));
        return docPage;
    }

}
