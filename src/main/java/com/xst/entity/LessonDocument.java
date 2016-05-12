package com.xst.entity;

import javax.persistence.*;

/**
 * Created by CrazyCodess on 2016/5/12.
 */
@Entity
@Table(name = "lesson_document", schema = "db_xst_new")
public class LessonDocument {
    private int id;
    private Byte docType;
    private String fileName;
    private String fileExt;
    private int fileSize;
    private String filePath;
    private int pageCount;
    private int downloads;
    private int uploadTime;
    private int category1Id;
    private int category2Id;
    private int category3Id;
    private int category4Id;
    private int category5Id;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "doc_type", nullable = true)
    public Byte getDocType() {
        return docType;
    }

    public void setDocType(Byte docType) {
        this.docType = docType;
    }

    @Basic
    @Column(name = "file_name", nullable = true, length = 255)
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Basic
    @Column(name = "file_ext", nullable = true, length = 10)
    public String getFileExt() {
        return fileExt;
    }

    public void setFileExt(String fileExt) {
        this.fileExt = fileExt;
    }

    @Basic
    @Column(name = "file_size", nullable = true)
    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    @Basic
    @Column(name = "file_path", nullable = true, length = 200)
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Basic
    @Column(name = "page_count", nullable = true)
    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Basic
    @Column(name = "downloads", nullable = true)
    public int getDownloads() {
        return downloads;
    }

    public void setDownloads(int downloads) {
        this.downloads = downloads;
    }

    @Basic
    @Column(name = "upload_time", nullable = true)
    public int getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(int uploadTime) {
        this.uploadTime = uploadTime;
    }

    @Basic
    @Column(name = "category_1_id", nullable = true)
    public int getCategory1Id() {
        return category1Id;
    }

    public void setCategory1Id(int category1Id) {
        this.category1Id = category1Id;
    }

    @Basic
    @Column(name = "category_2_id", nullable = true)
    public int getCategory2Id() {
        return category2Id;
    }

    public void setCategory2Id(int category2Id) {
        this.category2Id = category2Id;
    }

    @Basic
    @Column(name = "category_3_id", nullable = true)
    public int getCategory3Id() {
        return category3Id;
    }

    public void setCategory3Id(int category3Id) {
        this.category3Id = category3Id;
    }

    @Basic
    @Column(name = "category_4_id", nullable = true)
    public int getCategory4Id() {
        return category4Id;
    }

    public void setCategory4Id(int category4Id) {
        this.category4Id = category4Id;
    }

    @Basic
    @Column(name = "category_5_id", nullable = true)
    public int getCategory5Id() {
        return category5Id;
    }

    public void setCategory5Id(int category5Id) {
        this.category5Id = category5Id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LessonDocument that = (LessonDocument) o;

        if (id != that.id) return false;
        if (fileSize != that.fileSize) return false;
        if (pageCount != that.pageCount) return false;
        if (downloads != that.downloads) return false;
        if (uploadTime != that.uploadTime) return false;
        if (category1Id != that.category1Id) return false;
        if (category2Id != that.category2Id) return false;
        if (category3Id != that.category3Id) return false;
        if (category4Id != that.category4Id) return false;
        if (category5Id != that.category5Id) return false;
        if (!docType.equals(that.docType)) return false;
        if (!fileName.equals(that.fileName)) return false;
        if (!fileExt.equals(that.fileExt)) return false;
        return filePath.equals(that.filePath);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + docType.hashCode();
        result = 31 * result + fileName.hashCode();
        result = 31 * result + fileExt.hashCode();
        result = 31 * result + fileSize;
        result = 31 * result + filePath.hashCode();
        result = 31 * result + pageCount;
        result = 31 * result + downloads;
        result = 31 * result + uploadTime;
        result = 31 * result + category1Id;
        result = 31 * result + category2Id;
        result = 31 * result + category3Id;
        result = 31 * result + category4Id;
        result = 31 * result + category5Id;
        return result;
    }
}
