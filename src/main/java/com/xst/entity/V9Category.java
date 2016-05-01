package com.xst.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by sl on 16-5-1.
 */
@Entity
@javax.persistence.Table(name = "v9_category", schema = "", catalog = "db_xst_new")
public class V9Category {
    private short catid;

    @Id
    @javax.persistence.Column(name = "catid", nullable = false, insertable = true, updatable = true)
    public short getCatid() {
        return catid;
    }

    public void setCatid(short catid) {
        this.catid = catid;
    }

    private short siteid;

    @Basic
    @javax.persistence.Column(name = "siteid", nullable = false, insertable = true, updatable = true)
    public short getSiteid() {
        return siteid;
    }

    public void setSiteid(short siteid) {
        this.siteid = siteid;
    }

    private String module;

    @Basic
    @javax.persistence.Column(name = "module", nullable = false, insertable = true, updatable = true, length = 15)
    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    private byte type;

    @Basic
    @javax.persistence.Column(name = "type", nullable = false, insertable = true, updatable = true)
    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }

    private short modelid;

    @Basic
    @javax.persistence.Column(name = "modelid", nullable = false, insertable = true, updatable = true)
    public short getModelid() {
        return modelid;
    }

    public void setModelid(short modelid) {
        this.modelid = modelid;
    }

    private short parentid;

    @Basic
    @javax.persistence.Column(name = "parentid", nullable = false, insertable = true, updatable = true)
    public short getParentid() {
        return parentid;
    }

    public void setParentid(short parentid) {
        this.parentid = parentid;
    }

    private String arrparentid;

    @Basic
    @javax.persistence.Column(name = "arrparentid", nullable = false, insertable = true, updatable = true, length = 255)
    public String getArrparentid() {
        return arrparentid;
    }

    public void setArrparentid(String arrparentid) {
        this.arrparentid = arrparentid;
    }

    private byte child;

    @Basic
    @javax.persistence.Column(name = "child", nullable = false, insertable = true, updatable = true)
    public byte getChild() {
        return child;
    }

    public void setChild(byte child) {
        this.child = child;
    }

    private String arrchildid;

    @Basic
    @javax.persistence.Column(name = "arrchildid", nullable = false, insertable = true, updatable = true, length = 16777215)
    public String getArrchildid() {
        return arrchildid;
    }

    public void setArrchildid(String arrchildid) {
        this.arrchildid = arrchildid;
    }

    private String catname;

    @Basic
    @javax.persistence.Column(name = "catname", nullable = false, insertable = true, updatable = true, length = 30)
    public String getCatname() {
        return catname;
    }

    public void setCatname(String catname) {
        this.catname = catname;
    }

    private String style;

    @Basic
    @javax.persistence.Column(name = "style", nullable = false, insertable = true, updatable = true, length = 5)
    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    private String image;

    @Basic
    @javax.persistence.Column(name = "image", nullable = false, insertable = true, updatable = true, length = 100)
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    private String parentdir;

    @Basic
    @javax.persistence.Column(name = "parentdir", nullable = false, insertable = true, updatable = true, length = 100)
    public String getParentdir() {
        return parentdir;
    }

    public void setParentdir(String parentdir) {
        this.parentdir = parentdir;
    }

    private String catdir;

    @Basic
    @javax.persistence.Column(name = "catdir", nullable = false, insertable = true, updatable = true, length = 30)
    public String getCatdir() {
        return catdir;
    }

    public void setCatdir(String catdir) {
        this.catdir = catdir;
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

    private int items;

    @Basic
    @javax.persistence.Column(name = "items", nullable = false, insertable = true, updatable = true)
    public int getItems() {
        return items;
    }

    public void setItems(int items) {
        this.items = items;
    }

    private int hits;

    @Basic
    @javax.persistence.Column(name = "hits", nullable = false, insertable = true, updatable = true)
    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    private String setting;

    @Basic
    @javax.persistence.Column(name = "setting", nullable = false, insertable = true, updatable = true, length = 16777215)
    public String getSetting() {
        return setting;
    }

    public void setSetting(String setting) {
        this.setting = setting;
    }

    private short listorder;

    @Basic
    @javax.persistence.Column(name = "listorder", nullable = false, insertable = true, updatable = true)
    public short getListorder() {
        return listorder;
    }

    public void setListorder(short listorder) {
        this.listorder = listorder;
    }

    private byte ismenu;

    @Basic
    @javax.persistence.Column(name = "ismenu", nullable = false, insertable = true, updatable = true)
    public byte getIsmenu() {
        return ismenu;
    }

    public void setIsmenu(byte ismenu) {
        this.ismenu = ismenu;
    }

    private byte sethtml;

    @Basic
    @javax.persistence.Column(name = "sethtml", nullable = false, insertable = true, updatable = true)
    public byte getSethtml() {
        return sethtml;
    }

    public void setSethtml(byte sethtml) {
        this.sethtml = sethtml;
    }

    private String letter;

    @Basic
    @javax.persistence.Column(name = "letter", nullable = false, insertable = true, updatable = true, length = 30)
    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    private String usableType;

    @Basic
    @javax.persistence.Column(name = "usable_type", nullable = false, insertable = true, updatable = true, length = 255)
    public String getUsableType() {
        return usableType;
    }

    public void setUsableType(String usableType) {
        this.usableType = usableType;
    }

    private String rgroup;

    @Basic
    @javax.persistence.Column(name = "rgroup", nullable = false, insertable = true, updatable = true, length = 20)
    public String getRgroup() {
        return rgroup;
    }

    public void setRgroup(String rgroup) {
        this.rgroup = rgroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        V9Category that = (V9Category) o;

        if (catid != that.catid) return false;
        if (siteid != that.siteid) return false;
        if (type != that.type) return false;
        if (modelid != that.modelid) return false;
        if (parentid != that.parentid) return false;
        if (child != that.child) return false;
        if (items != that.items) return false;
        if (hits != that.hits) return false;
        if (listorder != that.listorder) return false;
        if (ismenu != that.ismenu) return false;
        if (sethtml != that.sethtml) return false;
        if (module != null ? !module.equals(that.module) : that.module != null) return false;
        if (arrparentid != null ? !arrparentid.equals(that.arrparentid) : that.arrparentid != null) return false;
        if (arrchildid != null ? !arrchildid.equals(that.arrchildid) : that.arrchildid != null) return false;
        if (catname != null ? !catname.equals(that.catname) : that.catname != null) return false;
        if (style != null ? !style.equals(that.style) : that.style != null) return false;
        if (image != null ? !image.equals(that.image) : that.image != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (parentdir != null ? !parentdir.equals(that.parentdir) : that.parentdir != null) return false;
        if (catdir != null ? !catdir.equals(that.catdir) : that.catdir != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (setting != null ? !setting.equals(that.setting) : that.setting != null) return false;
        if (letter != null ? !letter.equals(that.letter) : that.letter != null) return false;
        if (usableType != null ? !usableType.equals(that.usableType) : that.usableType != null) return false;
        if (rgroup != null ? !rgroup.equals(that.rgroup) : that.rgroup != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) catid;
        result = 31 * result + (int) siteid;
        result = 31 * result + (module != null ? module.hashCode() : 0);
        result = 31 * result + (int) type;
        result = 31 * result + (int) modelid;
        result = 31 * result + (int) parentid;
        result = 31 * result + (arrparentid != null ? arrparentid.hashCode() : 0);
        result = 31 * result + (int) child;
        result = 31 * result + (arrchildid != null ? arrchildid.hashCode() : 0);
        result = 31 * result + (catname != null ? catname.hashCode() : 0);
        result = 31 * result + (style != null ? style.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (parentdir != null ? parentdir.hashCode() : 0);
        result = 31 * result + (catdir != null ? catdir.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + items;
        result = 31 * result + hits;
        result = 31 * result + (setting != null ? setting.hashCode() : 0);
        result = 31 * result + (int) listorder;
        result = 31 * result + (int) ismenu;
        result = 31 * result + (int) sethtml;
        result = 31 * result + (letter != null ? letter.hashCode() : 0);
        result = 31 * result + (usableType != null ? usableType.hashCode() : 0);
        result = 31 * result + (rgroup != null ? rgroup.hashCode() : 0);
        return result;
    }
}
