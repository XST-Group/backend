package com.xst.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by sl on 16-4-30.
 */
@Entity
@javax.persistence.Table(name = "v9_news", schema = "", catalog = "db_xst_new")
public class V9News {
    private String type;

    @Basic
    @javax.persistence.Column(name = "type", nullable = false, insertable = true, updatable = true, length = 10)
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

    private short catid;

    @Basic
    @javax.persistence.Column(name = "catid", nullable = false, insertable = true, updatable = true)
    public short getCatid() {
        return catid;
    }

    public void setCatid(short catid) {
        this.catid = catid;
    }

    private short typeid;

    @Basic
    @javax.persistence.Column(name = "typeid", nullable = false, insertable = true, updatable = true)
    public short getTypeid() {
        return typeid;
    }

    public void setTypeid(short typeid) {
        this.typeid = typeid;
    }

    private String title;

    @Basic
    @javax.persistence.Column(name = "title", nullable = false, insertable = true, updatable = true, length = 80)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String style;

    @Basic
    @javax.persistence.Column(name = "style", nullable = false, insertable = true, updatable = true, length = 24)
    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    private String thumb;

    @Basic
    @javax.persistence.Column(name = "thumb", nullable = false, insertable = true, updatable = true, length = 100)
    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    private String keywords;

    @Basic
    @javax.persistence.Column(name = "keywords", nullable = false, insertable = true, updatable = true, length = 40)
    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    private String description;

    @Basic
    @javax.persistence.Column(name = "description", nullable = false, insertable = true, updatable = true, length = 16777215)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private byte posids;

    @Basic
    @javax.persistence.Column(name = "posids", nullable = false, insertable = true, updatable = true)
    public byte getPosids() {
        return posids;
    }

    public void setPosids(byte posids) {
        this.posids = posids;
    }

    private String url;

    @Basic
    @javax.persistence.Column(name = "url", nullable = false, insertable = true, updatable = true, length = 100)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private byte listorder;

    @Basic
    @javax.persistence.Column(name = "listorder", nullable = false, insertable = true, updatable = true)
    public byte getListorder() {
        return listorder;
    }

    public void setListorder(byte listorder) {
        this.listorder = listorder;
    }

    private byte status;

    @Basic
    @javax.persistence.Column(name = "status", nullable = false, insertable = true, updatable = true)
    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    private byte sysadd;

    @Basic
    @javax.persistence.Column(name = "sysadd", nullable = false, insertable = true, updatable = true)
    public byte getSysadd() {
        return sysadd;
    }

    public void setSysadd(byte sysadd) {
        this.sysadd = sysadd;
    }

    private byte islink;

    @Basic
    @javax.persistence.Column(name = "islink", nullable = false, insertable = true, updatable = true)
    public byte getIslink() {
        return islink;
    }

    public void setIslink(byte islink) {
        this.islink = islink;
    }

    private String username;

    @Basic
    @javax.persistence.Column(name = "username", nullable = false, insertable = true, updatable = true, length = 20)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private int inputtime;

    @Basic
    @javax.persistence.Column(name = "inputtime", nullable = false, insertable = true, updatable = true)
    public int getInputtime() {
        return inputtime;
    }

    public void setInputtime(int inputtime) {
        this.inputtime = inputtime;
    }

    private int updatetime;

    @Basic
    @javax.persistence.Column(name = "updatetime", nullable = false, insertable = true, updatable = true)
    public int getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(int updatetime) {
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
        if (catid != v9News.catid) return false;
        if (typeid != v9News.typeid) return false;
        if (posids != v9News.posids) return false;
        if (listorder != v9News.listorder) return false;
        if (status != v9News.status) return false;
        if (sysadd != v9News.sysadd) return false;
        if (islink != v9News.islink) return false;
        if (inputtime != v9News.inputtime) return false;
        if (updatetime != v9News.updatetime) return false;
        if (type != null ? !type.equals(v9News.type) : v9News.type != null) return false;
        if (title != null ? !title.equals(v9News.title) : v9News.title != null) return false;
        if (style != null ? !style.equals(v9News.style) : v9News.style != null) return false;
        if (thumb != null ? !thumb.equals(v9News.thumb) : v9News.thumb != null) return false;
        if (keywords != null ? !keywords.equals(v9News.keywords) : v9News.keywords != null) return false;
        if (description != null ? !description.equals(v9News.description) : v9News.description != null) return false;
        if (url != null ? !url.equals(v9News.url) : v9News.url != null) return false;
        if (username != null ? !username.equals(v9News.username) : v9News.username != null) return false;
        if (arrGroupId != null ? !arrGroupId.equals(v9News.arrGroupId) : v9News.arrGroupId != null) return false;
        if (content != null ? !content.equals(v9News.content) : v9News.content != null) return false;
        if (createname != null ? !createname.equals(v9News.createname) : v9News.createname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + id;
        result = 31 * result + (int) catid;
        result = 31 * result + (int) typeid;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (style != null ? style.hashCode() : 0);
        result = 31 * result + (thumb != null ? thumb.hashCode() : 0);
        result = 31 * result + (keywords != null ? keywords.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (int) posids;
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (int) listorder;
        result = 31 * result + (int) status;
        result = 31 * result + (int) sysadd;
        result = 31 * result + (int) islink;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + inputtime;
        result = 31 * result + updatetime;
        result = 31 * result + (arrGroupId != null ? arrGroupId.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (createname != null ? createname.hashCode() : 0);
        return result;
    }
}
