package com.xst.dao;

import com.xst.bean.DocCategory;
import com.xst.entity.LessonCategory;
import com.xst.entity.LessonDocument;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CrazyCodess on 2016/5/13.
 */
@Repository("lessonCategoryDao")
public class LessonCatgoryDao extends  BaseDao {


    public LessonCategory getById(int id){
        return  get(LessonCategory.class,id);
    }

    public void saveLessoncate(LessonCategory Lessoncate){
        save(Lessoncate);
    }

    public void deleteLessongory(LessonCategory Lessoncate){
        delete(Lessoncate);
    }

    public void updateLessongory(LessonCategory Lessoncate){
        saveOrUpdate(Lessoncate);
    }

    /**
     * 通过id获取一个目录及子目录
     * @param id
     * @return
     */
    public DocCategory getDocCategory(int id){

        DocCategory docCategory=new DocCategory();//一级目录

        LessonCategory lessgory=getById(id);
        docCategory.setId(id);
        docCategory.setName(lessgory.getCatname());
        if(id<=4){          //添加子目录
            String[] ids=lessgory.getArrchildid().split(",");
            String hql="from LessonCategory where ";
            for(int i=0;i<ids.length;i++){
                //DocCategory doccate=new DocCategory();
                if(i==0){
                    hql=hql+"id = "+ids[i];
                }
                else{
                    hql=hql+" or id ="+ids[i];
                }
            }
            List<LessonCategory> docList= query(hql).list();
            docCategory.setChildren(new ArrayList<DocCategory>());
            for(int i=0;i<docList.size();i++){
                docCategory.getChildren().add(new DocCategory(docList.get(i).getId(),null,docList.get(i).getCatname()));
            }

        }else{
            docCategory.setChildren(null);
        }
        return docCategory;
    }

}
