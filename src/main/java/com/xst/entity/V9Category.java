package com.xst.entity;

import javax.persistence.*;

/**
 * Created by sl on 16-2-27.
 */
@Entity
@Table(name = "v9_category", schema = "", catalog = "db_xst_new")
public class V9Category {

    private short catid;
    private short siteid;
    private String module;
    private byte type;
    private short modelid;
    private short parentid;
    private String arrparentid;
    private int child;
    private String arrchildid;
    private String catname;
    private String style;
    private String image;
    private String description;
    private String parentdir;
    private String catdir;
    private String url;
    private int items;
    private int hits;
    private String setting;
    private short listorder;
    private byte ismenu;
    private byte sethtml;
    private String letter;
    private String usableType;
    private String rgroup;

    @Id
    @Column(name = "catid")
    public short getCatid() {
        return catid;
    }

    public void setCatid(short catid) {
        this.catid = catid;
    }

    @Basic
    @Column(name = "siteid")
    public short getSiteid() {
        return siteid;
    }

    public void setSiteid(short siteid) {
        this.siteid = siteid;
    }

    @Basic
    @Column(name = "module")
    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    @Basic
    @Column(name = "type")
    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }

    @Basic
    @Column(name = "modelid")
    public short getModelid() {
        return modelid;
    }

    public void setModelid(short modelid) {
        this.modelid = modelid;
    }

    @Basic
    @Column(name = "parentid")
    public short getParentid() {
        return parentid;
    }

    public void setParentid(short parentid) {
        this.parentid = parentid;
    }

    @Basic
    @Column(name = "arrparentid")
    public String getArrparentid() {
        return arrparentid;
    }

    public void setArrparentid(String arrparentid) {
        this.arrparentid = arrparentid;
    }

    @Basic
    @Column(name = "child")
    public int getChild() {
        return child;
    }

    public void setChild(int child) {
        this.child = child;
    }

    @Basic
    @Column(name = "arrchildid")
    public String getArrchildid() {
        return arrchildid;
    }

    public void setArrchildid(String arrchildid) {
        this.arrchildid = arrchildid;
    }

    @Basic
    @Column(name = "catname")
    public String getCatname() {
        return catname;
    }

    public void setCatname(String catname) {
        this.catname = catname;
    }

    @Basic
    @Column(name = "style")
    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Basic
    @Column(name = "image")
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "parentdir")
    public String getParentdir() {
        return parentdir;
    }

    public void setParentdir(String parentdir) {
        this.parentdir = parentdir;
    }

    @Basic
    @Column(name = "catdir")
    public String getCatdir() {
        return catdir;
    }

    public void setCatdir(String catdir) {
        this.catdir = catdir;
    }

    @Basic
    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "items")
    public int getItems() {
        return items;
    }

    public void setItems(int items) {
        this.items = items;
    }

    @Basic
    @Column(name = "hits")
    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    @Basic
    @Column(name = "setting")
    public String getSetting() {
        return setting;
    }

    public void setSetting(String setting) {
        this.setting = setting;
    }

    @Basic
    @Column(name = "listorder")
    public short getListorder() {
        return listorder;
    }

    public void setListorder(short listorder) {
        this.listorder = listorder;
    }

    @Basic
    @Column(name = "ismenu")
    public byte getIsmenu() {
        return ismenu;
    }

    public void setIsmenu(byte ismenu) {
        this.ismenu = ismenu;
    }

    @Basic
    @Column(name = "sethtml")
    public byte getSethtml() {
        return sethtml;
    }

    public void setSethtml(byte sethtml) {
        this.sethtml = sethtml;
    }

    @Basic
    @Column(name = "letter")
    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    @Basic
    @Column(name = "usable_type")
    public String getUsableType() {
        return usableType;
    }

    public void setUsableType(String usableType) {
        this.usableType = usableType;
    }

    @Basic
    @Column(name = "rgroup")
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
