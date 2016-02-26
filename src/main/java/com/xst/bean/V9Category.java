package com.xst.bean;

import javax.persistence.*;

/**
 * Created by sl on 16-2-24.
 */

@Entity
@Table(name = "v9_category" , schema = "db_xst")
public class V9Category {

    private Integer catid;
    private Integer siteid;
    private String module;
    private Integer type;
    private Integer modelid;
    private Integer parentid;
    private String  arrparentid;
    private Integer child;
    private String arrchildid;
    private String catname;
    private String style;
    private String image;
    private String description;
    private String parentdir;
    private String catdir;
    private String url;
    private Integer items;
    private Integer hits;
    private String setting;
    private Integer listorder;
    private boolean ismenu;
    private Integer sethtml;
    private String letter;
    private String usable_type;
    private String rgroup;

    @Id
    @Column(name = "catid")
    public Integer getCatid() {
        return catid;
    }

    public void setCatid(Integer catxid) {
        this.catid = catid;
    }

    @Basic
    @Column(name = "siteid")
    public Integer getSiteid() {
        return siteid;
    }

    public void setSiteid(Integer siteid) {
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
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Basic
    @Column(name = "modelid")
    public Integer getModelid() {
        return modelid;
    }

    public void setModelid(Integer modelid) {
        this.modelid = modelid;
    }


    /**
     * ????
     * @return
     */
    @Basic
    @Column(name = "parentid")
    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }


    /**
     * ????
     * @return
     */
    @Basic
    @Column(name = "arrparentid")
    public String getArrparentid() {
        return arrparentid;
    }

    public void setArrparentid(String arrparentid) {
        this.arrparentid = arrparentid;
    }


    /**
     * ????
     * @return
     */
    @Basic
    @Column(name = "child")
    public Integer getChild() {
        return child;
    }

    public void setChild(Integer child) {
        this.child = child;
    }



    /**
     * ????
     * @return
     */
    @Basic
    @Column(name = "arrchildid")
    public String  getArrchildid() {
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
    public Integer getItems() {
        return items;
    }

    public void setItems(Integer items) {
        this.items = items;
    }

    @Basic
    @Column(name = "hits")
    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
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
    public Integer getListorder() {
        return listorder;
    }

    public void setListorder(Integer listorder) {
        this.listorder = listorder;
    }

    @Basic
    @Column(name = "ismenu")
    public boolean getIsmenu() {
        return ismenu;
    }

    public void setIsmenu(boolean ismenu) {
        this.ismenu = ismenu;
    }

    @Basic
    @Column(name = "sethtml")
    public Integer getSethtml() {
        return sethtml;
    }

    public void setSethtml(Integer sethtml) {
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
    public String getUsable_type() {
        return usable_type;
    }

    public void setUsable_type(String usable_type) {
        this.usable_type = usable_type;
    }

    @Basic
    @Column(name = "rgroup")
    public String getRgroup() {
        return rgroup;
    }

    public void setRgroup(String rgroup) {
        this.rgroup = rgroup;
    }



}
