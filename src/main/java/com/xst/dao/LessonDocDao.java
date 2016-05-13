package com.xst.dao;

import com.xst.entity.LessonDocument;
import org.springframework.stereotype.Repository;

/**
 * Created by CrazyCodess on 2016/5/13.
 */
@Repository("lessonDocDao")
public class LessonDocDao extends  BaseDao {
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


}
