package com.xst.dao;

import com.xst.entity.LessonDocument;
import com.xst.entity.V9News;
import com.xst.page.Page;
import com.xst.page.PageHandler;
import com.xst.util.HashUtils;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

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

    public Page<LessonDocument> queryAllDocPage(int pageNum , int pageSize,int id){
        String hql = "from  LessonDocument ";
        if(id==0){

        }
        else if(id>=1&&id<=4){
            hql=hql+"where category1Id >=1 and category1Id<=4";
        }
        else if(id>=5&&id<=6){
            hql=hql+"where category2Id >=5 and category2Id<=6";
        }
        else if(id>=7&&id<=9){
            hql=hql+"where category2Id >=7 and category2Id<=9";
        }
        else if(id>=10&&id<=18){
            hql=hql+"where category2Id >=10 and category2Id<=18";
        }
        else if(id>=19&&id<=28){
            hql=hql+"where category2Id >=19 and category2Id<=28";
        }
        Page<LessonDocument> docPage = docPageHandler.getPage(pageNum, pageSize, LessonDocument.class, query(hql));
        return docPage;
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

    public Page<LessonDocument> queryDocPage(int pageNum , int pageSize){
        String hql="from LessonDocument order by uploadTime desc ";
        Query query = query(hql);
        Page<LessonDocument> docPage = docPageHandler.getPage(pageNum, pageSize, LessonDocument.class, query);
        return docPage;
    }

    public void saveFile(String doctype,MultipartFile multipartFile, int cate1,int cate2){
        String name = multipartFile.getOriginalFilename();
        System.out.println("文件名："+name);
/*        String projectPath = session.getServletContext().getRealPath("/");

        projectPath = getProjectRealPath(projectPath);*/
        String path=null;
        switch (cate1){
            case 1:path="学前";break;
            case 2:path="小学";break;
            case 3:path="初中";break;
            case 4:path="高中";break;
        }
        String fileUrl = /*projectPath*/ "F:/codes/github/repository1/xst/src/main/webapp/assets/doc/"+ path + "/" +name;

        System.out.println("filePath : "+fileUrl);
        LessonDocument lesDoc = new LessonDocument();
        int index=name.lastIndexOf('.');
        lesDoc.setDocType(doctype);
        lesDoc.setFileName(name.substring(0,index));
        lesDoc.setFileExt(name.substring(index,name.length()));
        long filesize=multipartFile.getSize();
        if(filesize<1024){
            lesDoc.setFileSize((int)multipartFile.getSize()+"B");
        }
        else if(filesize>=1024){
            lesDoc.setFileSize((int)(multipartFile.getSize()/1024)+"KB");
        }
        else if(filesize>1024*1024){
            lesDoc.setFileSize((int)(multipartFile.getSize()/(1024*1024))+"M");
        }
        lesDoc.setCategory1Id(cate1);
        lesDoc.setCategory2Id(cate2);
        lesDoc.setDownloads(0);
        lesDoc.setFilePath("/doc/"+path);
        lesDoc.setUploadTime((int)(System.currentTimeMillis()/1000));
        System.out.println("时间戳======="+System.currentTimeMillis());
        saveLessonDoc(lesDoc);

        try {
            File file = null;
            file = new File(path);
            if(!file.exists()){
                file.mkdirs();
            }
            byte[] buffer = multipartFile.getBytes();
            FileOutputStream fStream = new FileOutputStream(fileUrl);
            fStream.write(buffer);
            fStream.close();
        } catch (IOException e) {
            fileUrl = "";
            e.printStackTrace();
        }
    }

}
