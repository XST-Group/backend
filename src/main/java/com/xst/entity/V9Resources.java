package com.xst.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by sl on 16-5-1.
 */
@Entity
@javax.persistence.Table(name = "v9_resources", schema = "", catalog = "db_xst_new")
public class V9Resources {
    private int id;

    @Id
    @javax.persistence.Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String title;

    @Basic
    @javax.persistence.Column(name = "title", nullable = true, insertable = true, updatable = true, length = 200)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String creatime;

    @Basic
    @javax.persistence.Column(name = "creatime", nullable = true, insertable = true, updatable = true, length = 11)
    public String getCreatime() {
        return creatime;
    }

    public void setCreatime(String creatime) {
        this.creatime = creatime;
    }

    private String url;

    @Basic
    @javax.persistence.Column(name = "url", nullable = true, insertable = true, updatable = true, length = 65535)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private String category1;

    @Basic
    @javax.persistence.Column(name = "category_1", nullable = true, insertable = true, updatable = true, length = 100)
    public String getCategory1() {
        return category1;
    }

    public void setCategory1(String category1) {
        this.category1 = category1;
    }

    private String category2;

    @Basic
    @javax.persistence.Column(name = "category_2", nullable = true, insertable = true, updatable = true, length = 100)
    public String getCategory2() {
        return category2;
    }

    public void setCategory2(String category2) {
        this.category2 = category2;
    }

    private String category3;

    @Basic
    @javax.persistence.Column(name = "category_3", nullable = true, insertable = true, updatable = true, length = 100)
    public String getCategory3() {
        return category3;
    }

    public void setCategory3(String category3) {
        this.category3 = category3;
    }

    private String rgroup;

    @Basic
    @javax.persistence.Column(name = "rgroup", nullable = true, insertable = true, updatable = true, length = 10)
    public String getRgroup() {
        return rgroup;
    }

    public void setRgroup(String rgroup) {
        this.rgroup = rgroup;
    }

    private Integer rstatus;

    @Basic
    @javax.persistence.Column(name = "rstatus", nullable = true, insertable = true, updatable = true)
    public Integer getRstatus() {
        return rstatus;
    }

    public void setRstatus(Integer rstatus) {
        this.rstatus = rstatus;
    }

    private Integer category1Id;

    @Basic
    @javax.persistence.Column(name = "category_1_id", nullable = true, insertable = true, updatable = true)
    public Integer getCategory1Id() {
        return category1Id;
    }

    public void setCategory1Id(Integer category1Id) {
        this.category1Id = category1Id;
    }

    private Integer category2Id;

    @Basic
    @javax.persistence.Column(name = "category_2_id", nullable = true, insertable = true, updatable = true)
    public Integer getCategory2Id() {
        return category2Id;
    }

    public void setCategory2Id(Integer category2Id) {
        this.category2Id = category2Id;
    }

    private Integer category3Id;

    @Basic
    @javax.persistence.Column(name = "category_3_id", nullable = true, insertable = true, updatable = true)
    public Integer getCategory3Id() {
        return category3Id;
    }

    public void setCategory3Id(Integer category3Id) {
        this.category3Id = category3Id;
    }

    private Integer category4Id;

    @Basic
    @javax.persistence.Column(name = "category_4_id", nullable = true, insertable = true, updatable = true)
    public Integer getCategory4Id() {
        return category4Id;
    }

    public void setCategory4Id(Integer category4Id) {
        this.category4Id = category4Id;
    }

    private Integer category5Id;

    @Basic
    @javax.persistence.Column(name = "category_5_id", nullable = true, insertable = true, updatable = true)
    public Integer getCategory5Id() {
        return category5Id;
    }

    public void setCategory5Id(Integer category5Id) {
        this.category5Id = category5Id;
    }

    private String category4;

    @Basic
    @javax.persistence.Column(name = "category_4", nullable = true, insertable = true, updatable = true, length = 100)
    public String getCategory4() {
        return category4;
    }

    public void setCategory4(String category4) {
        this.category4 = category4;
    }

    private String category5;

    @Basic
    @javax.persistence.Column(name = "category_5", nullable = true, insertable = true, updatable = true, length = 100)
    public String getCategory5() {
        return category5;
    }

    public void setCategory5(String category5) {
        this.category5 = category5;
    }

    private String thumb;

    @Basic
    @javax.persistence.Column(name = "thumb", nullable = true, insertable = true, updatable = true, length = 500)
    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    private Integer hits;

    @Basic
    @javax.persistence.Column(name = "hits", nullable = true, insertable = true, updatable = true)
    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    private String arrGroupId;

    @Basic
    @javax.persistence.Column(name = "arr_group_id", nullable = true, insertable = true, updatable = true, length = 255)
    public String getArrGroupId() {
        return arrGroupId;
    }

    public void setArrGroupId(String arrGroupId) {
        this.arrGroupId = arrGroupId;
    }

    private String description;

    @Basic
    @javax.persistence.Column(name = "description", nullable = true, insertable = true, updatable = true, length = 65535)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        V9Resources resources = (V9Resources) o;

        if (id != resources.id) return false;
        if (title != null ? !title.equals(resources.title) : resources.title != null) return false;
        if (creatime != null ? !creatime.equals(resources.creatime) : resources.creatime != null) return false;
        if (url != null ? !url.equals(resources.url) : resources.url != null) return false;
        if (category1 != null ? !category1.equals(resources.category1) : resources.category1 != null) return false;
        if (category2 != null ? !category2.equals(resources.category2) : resources.category2 != null) return false;
        if (category3 != null ? !category3.equals(resources.category3) : resources.category3 != null) return false;
        if (rgroup != null ? !rgroup.equals(resources.rgroup) : resources.rgroup != null) return false;
        if (rstatus != null ? !rstatus.equals(resources.rstatus) : resources.rstatus != null) return false;
        if (category1Id != null ? !category1Id.equals(resources.category1Id) : resources.category1Id != null)
            return false;
        if (category2Id != null ? !category2Id.equals(resources.category2Id) : resources.category2Id != null)
            return false;
        if (category3Id != null ? !category3Id.equals(resources.category3Id) : resources.category3Id != null)
            return false;
        if (category4Id != null ? !category4Id.equals(resources.category4Id) : resources.category4Id != null)
            return false;
        if (category5Id != null ? !category5Id.equals(resources.category5Id) : resources.category5Id != null)
            return false;
        if (category4 != null ? !category4.equals(resources.category4) : resources.category4 != null) return false;
        if (category5 != null ? !category5.equals(resources.category5) : resources.category5 != null) return false;
        if (thumb != null ? !thumb.equals(resources.thumb) : resources.thumb != null) return false;
        if (hits != null ? !hits.equals(resources.hits) : resources.hits != null) return false;
        if (arrGroupId != null ? !arrGroupId.equals(resources.arrGroupId) : resources.arrGroupId != null) return false;
        if (description != null ? !description.equals(resources.description) : resources.description != null)
            return false;

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
        result = 31 * result + (arrGroupId != null ? arrGroupId.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
