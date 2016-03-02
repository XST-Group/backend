package com.xst.entity;

import javax.persistence.*;

/**
 * Created by Sloriac on 16/2/21.
 */
@Entity
@Table(name = "v9_admin", schema = "db_xst_new")
public class V9Admin {
    private Integer userid;
    private String username;
    private String password;
    private V9AdminRole v9AdminRole;
    private String encrypt;
    private String lastloginip;
    private Integer lastlogintime;
    private String email;
    private String realname;
    private String card;
    private String lang;

    @Id
    @Column(name = "userid")
    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "roleid", nullable = true)
    public V9AdminRole getV9AdminRole() {
        return v9AdminRole;
    }

    public void setV9AdminRole(V9AdminRole v9AdminRole) {
        this.v9AdminRole = v9AdminRole;
    }


    @Basic
    @Column(name = "encrypt")
    public String getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(String encrypt) {
        this.encrypt = encrypt;
    }

    @Basic
    @Column(name = "lastloginip")
    public String getLastloginip() {
        return lastloginip;
    }

    public void setLastloginip(String lastloginip) {
        this.lastloginip = lastloginip;
    }

    @Basic
    @Column(name = "lastlogintime")
    public Integer getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Integer lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "realname")
    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    @Basic
    @Column(name = "card")
    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    @Basic
    @Column(name = "lang")
    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

}
