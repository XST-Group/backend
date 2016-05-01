package com.xst.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by sl on 16-5-1.
 */
@Entity
@javax.persistence.Table(name = "v9_news", schema = "", catalog = "db_xst_new")
public class V9News {
    private String type;

    @Basic
    @javax.persistence.Column(name = "type", nullable = true, insertable = true, updatable = true, length = 10)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private int id;

    @Id
    @javax.persistence.Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private Short catid;

    @Basic
    @javax.persistence.Column(name = "catid", nullable = true, insertable = true, updatable = true)
    public Short getCatid() {
        return catid;
    }

    public void setCatid(Short catid) {
        this.catid = catid;
    }

    private Short typeid;

    @Basic
    @javax.persistence.Column(name = "typeid", nullable = true, insertable = true, updatable = true)
    public Short getTypeid() {
        return typeid;
    }

    public void setTypeid(Short typeid) {
        this.typeid = typeid;
    }

    private String title;

    @Basic
    @javax.persistence.Column(name = "title", nullable = true, insertable = true, updatable = true, length = 80)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String style;

    @Basic
    @javax.persistence.Column(name = "style", nullable = true, insertable = true, updatable = true, length = 24)
    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    private String thumb;

    @Basic
    @javax.persistence.Column(name = "thumb", nullable = true, insertable = true, updatable = true, length = 100)
    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    private String keywords;

    @Basic
    @javax.persistence.Column(name = "keywords", nullable = true, insertable = true, updatable = true, length = 40)
    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    private String description;

    @Basic
    @javax.persistence.Column(name = "description", nullable = true, insertable = true, updatable = true, length = 16777215)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private Byte posids;

    @Basic
    @javax.persistence.Column(name = "posids", nullable = true, insertable = true, updatable = true)
    public Byte getPosids() {
        return posids;
    }

    public void setPosids(Byte posids) {
        this.posids = posids;
    }

    private String url;

    @Basic
    @javax.persistence.Column(name = "url", nullable = true, insertable = true, updatable = true, length = 100)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private Byte listorder;

    @Basic
    @javax.persistence.Column(name = "listorder", nullable = true, insertable = true, updatable = true)
    public Byte getListorder() {
        return listorder;
    }

    public void setListorder(Byte listorder) {
        this.listorder = listorder;
    }

    private Byte status;

    @Basic
    @javax.persistence.Column(name = "status", nullable = true, insertable = true, updatable = true)
    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    private Byte sysadd;

    @Basic
    @javax.persistence.Column(name = "sysadd", nullable = true, insertable = true, updatable = true)
    public Byte getSysadd() {
        return sysadd;
    }

    public void setSysadd(Byte sysadd) {
        this.sysadd = sysadd;
    }

    private Byte islink;

    @Basic
    @javax.persistence.Column(name = "islink", nullable = true, insertable = true, updatable = true)
    public Byte getIslink() {
        return islink;
    }

    public void setIslink(Byte islink) {
        this.islink = islink;
    }

    private String username;

    @Basic
    @javax.persistence.Column(name = "username", nullable = true, insertable = true, updatable = true, length = 20)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private Integer inputtime;

    @Basic
    @javax.persistence.Column(name = "inputtime", nullable = true, insertable = true, updatable = true)
    public Integer getInputtime() {
        return inputtime;
    }

    public void setInputtime(Integer inputtime) {
        this.inputtime = inputtime;
    }

    private Integer updatetime;

    @Basic
    @javax.persistence.Column(name = "updatetime", nullable = true, insertable = true, updatable = true)
    public Integer getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Integer updatetime) {
        this.updatetime = updatetime;
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

    private String content;

    @Basic
    @javax.persistence.Column(name = "content", nullable = true, insertable = true, updatable = true, length = 16777215)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private String createname;

    @Basic
    @javax.persistence.Column(name = "createname", nullable = true, insertable = true, updatable = true, length = 10)
    public String getCreatename() {
        return createname;
    }

    public void setCreatename(String createname) {
        this.createname = createname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        V9News v9News = (V9News) o;

        if (id != v9News.id) return false;
        if (type != null ? !type.equals(v9News.type) : v9News.type != null) return false;
        if (catid != null ? !catid.equals(v9News.catid) : v9News.catid != null) return false;
        if (typeid != null ? !typeid.equals(v9News.typeid) : v9News.typeid != null) return false;
        if (title != null ? !title.equals(v9News.title) : v9News.title != null) return false;
        if (style != null ? !style.equals(v9News.style) : v9News.style != null) return false;
        if (thumb != null ? !thumb.equals(v9News.thumb) : v9News.thumb != null) return false;
        if (keywords != null ? !keywords.equals(v9News.keywords) : v9News.keywords != null) return false;
        if (description != null ? !description.equals(v9News.description) : v9News.description != null) return false;
        if (posids != null ? !posids.equals(v9News.posids) : v9News.posids != null) return false;
        if (url != null ? !url.equals(v9News.url) : v9News.url != null) return false;
        if (listorder != null ? !listorder.equals(v9News.listorder) : v9News.listorder != null) return false;
        if (status != null ? !status.equals(v9News.status) : v9News.status != null) return false;
        if (sysadd != null ? !sysadd.equals(v9News.sysadd) : v9News.sysadd != null) return false;
        if (islink != null ? !islink.equals(v9News.islink) : v9News.islink != null) return false;
        if (username != null ? !username.equals(v9News.username) : v9News.username != null) return false;
        if (inputtime != null ? !inputtime.equals(v9News.inputtime) : v9News.inputtime != null) return false;
        if (updatetime != null ? !updatetime.equals(v9News.updatetime) : v9News.updatetime != null) return false;
        if (arrGroupId != null ? !arrGroupId.equals(v9News.arrGroupId) : v9News.arrGroupId != null) return false;
        if (content != null ? !content.equals(v9News.content) : v9News.content != null) return false;
        if (createname != null ? !createname.equals(v9News.createname) : v9News.createname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + id;
        result = 31 * result + (catid != null ? catid.hashCode() : 0);
        result = 31 * result + (typeid != null ? typeid.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (style != null ? style.hashCode() : 0);
        result = 31 * result + (thumb != null ? thumb.hashCode() : 0);
        result = 31 * result + (keywords != null ? keywords.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (posids != null ? posids.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (listorder != null ? listorder.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (sysadd != null ? sysadd.hashCode() : 0);
        result = 31 * result + (islink != null ? islink.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (inputtime != null ? inputtime.hashCode() : 0);
        result = 31 * result + (updatetime != null ? updatetime.hashCode() : 0);
        result = 31 * result + (arrGroupId != null ? arrGroupId.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (createname != null ? createname.hashCode() : 0);
        return result;
    }
}
