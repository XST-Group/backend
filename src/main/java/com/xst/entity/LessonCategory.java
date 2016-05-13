package com.xst.entity;

import javax.persistence.*;

/**
 * Created by CrazyCodess on 2016/5/12.
 */
@Entity
@Table(name = "lesson_category", schema = "db_xst_new", catalog = "")
public class LessonCategory {
    private int id;
    private Integer docId;
    private String catname;
    private String arrchildid;
    private Integer parentid;
    private String arrparentid;
    private Integer child;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "doc_id", nullable = true)
    public Integer getDocId() {
        return docId;
    }

    public void setDocId(Integer docId) {
        this.docId = docId;
    }

    @Basic
    @Column(name = "catname", nullable = true, length = 30)
    public String getCatname() {
        return catname;
    }

    public void setCatname(String catname) {
        this.catname = catname;
    }

    @Basic
    @Column(name = "arrchildid", nullable = true, length = -1)
    public String getArrchildid() {
        return arrchildid;
    }

    public void setArrchildid(String arrchildid) {
        this.arrchildid = arrchildid;
    }

    @Basic
    @Column(name = "parentid", nullable = true)
    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    @Basic
    @Column(name = "arrparentid", nullable = true, length = 255)
    public String getArrparentid() {
        return arrparentid;
    }

    public void setArrparentid(String arrparentid) {
        this.arrparentid = arrparentid;
    }

    @Basic
    @Column(name = "child", nullable = true)
    public Integer getChild() {
        return child;
    }

    public void setChild(Integer child) {
        this.child = child;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LessonCategory that = (LessonCategory) o;

        if (id != that.id) return false;
        if (docId != null ? !docId.equals(that.docId) : that.docId != null) return false;
        if (catname != null ? !catname.equals(that.catname) : that.catname != null) return false;
        if (arrchildid != null ? !arrchildid.equals(that.arrchildid) : that.arrchildid != null) return false;
        if (parentid != null ? !parentid.equals(that.parentid) : that.parentid != null) return false;
        if (arrparentid != null ? !arrparentid.equals(that.arrparentid) : that.arrparentid != null) return false;
        if (child != null ? !child.equals(that.child) : that.child != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (docId != null ? docId.hashCode() : 0);
        result = 31 * result + (catname != null ? catname.hashCode() : 0);
        result = 31 * result + (arrchildid != null ? arrchildid.hashCode() : 0);
        result = 31 * result + (parentid != null ? parentid.hashCode() : 0);
        result = 31 * result + (arrparentid != null ? arrparentid.hashCode() : 0);
        result = 31 * result + (child != null ? child.hashCode() : 0);
        return result;
    }
}
