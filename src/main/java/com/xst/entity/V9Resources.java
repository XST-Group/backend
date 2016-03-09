package com.xst.entity;

import javax.persistence.*;

/**
 * Created by CrazyCodess on 2016/3/8.
 */
@Entity
@Table(name = "v9_resources", schema = "db_xst_new")
public class V9Resources {
    private int id;
    private String title;
    private String creatime;
    private String url;
    private String category1;
    private String category2;
    private String category3;
    private String rgroup;
    private Integer rstatus;
    private Integer category1Id;
    private Integer category2Id;
    private Integer category3Id;
    private Integer category4Id;
    private Integer category5Id;
    private String category4;
    private String category5;
    private String thumb;
    private Integer hits;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title", nullable = true, length = 200)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "creatime", nullable = true, length = 11)
    public String getCreatime() {
        return creatime;
    }

    public void setCreatime(String creatime) {
        this.creatime = creatime;
    }

    @Basic
    @Column(name = "url", nullable = true, length = -1)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "category_1", nullable = true, length = 100)
    public String getCategory1() {
        return category1;
    }

    public void setCategory1(String category1) {
        this.category1 = category1;
    }

    @Basic
    @Column(name = "category_2", nullable = true, length = 100)
    public String getCategory2() {
        return category2;
    }

    public void setCategory2(String category2) {
        this.category2 = category2;
    }

    @Basic
    @Column(name = "category_3", nullable = true, length = 100)
    public String getCategory3() {
        return category3;
    }

    public void setCategory3(String category3) {
        this.category3 = category3;
    }

    @Basic
    @Column(name = "rgroup", nullable = true, length = 10)
    public String getRgroup() {
        return rgroup;
    }

    public void setRgroup(String rgroup) {
        this.rgroup = rgroup;
    }

    @Basic
    @Column(name = "rstatus", nullable = true)
    public Integer getRstatus() {
        return rstatus;
    }

    public void setRstatus(Integer rstatus) {
        this.rstatus = rstatus;
    }

    @Basic
    @Column(name = "category_1_id", nullable = true)
    public Integer getCategory1Id() {
        return category1Id;
    }

    public void setCategory1Id(Integer category1Id) {
        this.category1Id = category1Id;
    }

    @Basic
    @Column(name = "category_2_id", nullable = true)
    public Integer getCategory2Id() {
        return category2Id;
    }

    public void setCategory2Id(Integer category2Id) {
        this.category2Id = category2Id;
    }

    @Basic
    @Column(name = "category_3_id", nullable = true)
    public Integer getCategory3Id() {
        return category3Id;
    }

    public void setCategory3Id(Integer category3Id) {
        this.category3Id = category3Id;
    }

    @Basic
    @Column(name = "category_4_id", nullable = true)
    public Integer getCategory4Id() {
        return category4Id;
    }

    public void setCategory4Id(Integer category4Id) {
        this.category4Id = category4Id;
    }

    @Basic
    @Column(name = "category_5_id", nullable = true)
    public Integer getCategory5Id() {
        return category5Id;
    }

    public void setCategory5Id(Integer category5Id) {
        this.category5Id = category5Id;
    }

    @Basic
    @Column(name = "category_4", nullable = true, length = 100)
    public String getCategory4() {
        return category4;
    }

    public void setCategory4(String category4) {
        this.category4 = category4;
    }

    @Basic
    @Column(name = "category_5", nullable = true, length = 100)
    public String getCategory5() {
        return category5;
    }

    public void setCategory5(String category5) {
        this.category5 = category5;
    }

    @Basic
    @Column(name = "thumb", nullable = true, length = 200)
    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    @Basic
    @Column(name = "hits", nullable = true)
    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        V9Resources that = (V9Resources) o;

        if (id != that.id) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (creatime != null ? !creatime.equals(that.creatime) : that.creatime != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (category1 != null ? !category1.equals(that.category1) : that.category1 != null) return false;
        if (category2 != null ? !category2.equals(that.category2) : that.category2 != null) return false;
        if (category3 != null ? !category3.equals(that.category3) : that.category3 != null) return false;
        if (rgroup != null ? !rgroup.equals(that.rgroup) : that.rgroup != null) return false;
        if (rstatus != null ? !rstatus.equals(that.rstatus) : that.rstatus != null) return false;
        if (category1Id != null ? !category1Id.equals(that.category1Id) : that.category1Id != null) return false;
        if (category2Id != null ? !category2Id.equals(that.category2Id) : that.category2Id != null) return false;
        if (category3Id != null ? !category3Id.equals(that.category3Id) : that.category3Id != null) return false;
        if (category4Id != null ? !category4Id.equals(that.category4Id) : that.category4Id != null) return false;
        if (category5Id != null ? !category5Id.equals(that.category5Id) : that.category5Id != null) return false;
        if (category4 != null ? !category4.equals(that.category4) : that.category4 != null) return false;
        if (category5 != null ? !category5.equals(that.category5) : that.category5 != null) return false;
        if (thumb != null ? !thumb.equals(that.thumb) : that.thumb != null) return false;
        if (hits != null ? !hits.equals(that.hits) : that.hits != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (creatime != null ? creatime.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (category1 != null ? category1.hashCode() : 0);
        result = 31 * result + (category2 != null ? category2.hashCode() : 0);
        result = 31 * result + (category3 != null ? category3.hashCode() : 0);
        result = 31 * result + (rgroup != null ? rgroup.hashCode() : 0);
        result = 31 * result + (rstatus != null ? rstatus.hashCode() : 0);
        result = 31 * result + (category1Id != null ? category1Id.hashCode() : 0);
        result = 31 * result + (category2Id != null ? category2Id.hashCode() : 0);
        result = 31 * result + (category3Id != null ? category3Id.hashCode() : 0);
        result = 31 * result + (category4Id != null ? category4Id.hashCode() : 0);
        result = 31 * result + (category5Id != null ? category5Id.hashCode() : 0);
        result = 31 * result + (category4 != null ? category4.hashCode() : 0);
        result = 31 * result + (category5 != null ? category5.hashCode() : 0);
        result = 31 * result + (thumb != null ? thumb.hashCode() : 0);
        result = 31 * result + (hits != null ? hits.hashCode() : 0);
        return result;
    }
}
