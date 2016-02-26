package com.xst.bean;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by sl on 16-2-25.
 */

@Entity
@Table(name = "v9_resources" , schema = "db_xst")
public class V9Resources {

    private Integer id;
    private String title;
    private String creatime;
    private String url;
    private String category_1;
    private String category_2;
    private String category_3;
    private String category_4;
    private String category_5;
    private String rgroup;
    private Integer category_1_id;
    private Integer category_2_id;
    private Integer category_3_id;
    private Integer category_4_id;
    private Integer category_5_id;


    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "creatime")
    public String getCreatime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(new Date(Long.parseLong(creatime)));
        return date;
    }

    public void setCreatime(String creatime) {
        this.creatime = creatime;
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
    @Column(name = "category_1")
    public String getCategory_1() {
        return category_1;
    }

    public void setCategory_1(String category_1) {
        this.category_1 = category_1;
    }

    @Basic
    @Column(name = "category_2")
    public String getCategory_2() {
        return category_2;
    }

    public void setCategory_2(String category_2) {
        this.category_2 = category_2;
    }

    @Basic
    @Column(name = "category_3")
    public String getCategory_3() {
        return category_3;
    }

    public void setCategory_3(String category_3) {
        this.category_3 = category_3;
    }

    @Basic
    @Column(name = "category_4")
    public String getCategory_4() {
        return category_4;
    }

    public void setCategory_4(String category_4) {
        this.category_4 = category_4;
    }

    @Basic
    @Column(name = "category_5")
    public String getCategory_5() {
        return category_5;
    }

    public void setCategory_5(String category_5) {
        this.category_5 = category_5;
    }


    @Basic
    @Column(name = "rgroup")
    public String getRgroup() {
        return rgroup;
    }

    public void setRgroup(String rgroup) {
        this.rgroup = rgroup;
    }

    @Basic
    @Column(name = "category_1_id")
    public Integer getCategory_1_id() {
        return category_1_id;
    }

    public void setCategory_1_id(Integer category_1_id) {
        this.category_1_id = category_1_id;
    }

    @Basic
    @Column(name = "category_2_id")
    public Integer getCategory_2_id() {
        return category_2_id;
    }

    public void setCategory_2_id(Integer category_2_id) {
        this.category_2_id = category_2_id;
    }

    @Basic
    @Column(name = "category_3_id")
    public Integer getCategory_3_id() {
        return category_3_id;
    }

    public void setCategory_3_id(Integer category_3_id) {
        this.category_3_id = category_3_id;
    }

    @Basic
    @Column(name = "category_5_id")
    public Integer getCategory_5_id() {
        return category_5_id;
    }

    public void setCategory_5_id(Integer category_5_id) {
        this.category_5_id = category_5_id;
    }

    @Basic
    @Column(name = "category_4_id")
    public Integer getCategory_4_id() {
        return category_4_id;
    }

    public void setCategory_4_id(Integer category_4_id) {
        this.category_4_id = category_4_id;
    }

}
