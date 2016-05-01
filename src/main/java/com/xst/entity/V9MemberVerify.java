package com.xst.entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by sl on 16-5-1.
 */
@Entity
@Table(name = "v9_member_verify", schema = "", catalog = "db_xst_new")
public class V9MemberVerify {
    private int userid;
    private String username;
    private String password;
    private String encrypt;
    private String nickname;
    private int regdate;
    private String regip;
    private String email;
    private byte modelid;
    private short point;
    private BigDecimal amount;
    private String modelinfo;
    private byte status;
    private byte siteid;
    private String message;
    private String contacts;
    private String telphone;

    @Id
    @Column(name = "userid", nullable = false, insertable = true, updatable = true)
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "username", nullable = false, insertable = true, updatable = true, length = 50)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password", nullable = false, insertable = true, updatable = true, length = 32)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "encrypt", nullable = false, insertable = true, updatable = true, length = 6)
    public String getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(String encrypt) {
        this.encrypt = encrypt;
    }

    @Basic
    @Column(name = "nickname", nullable = false, insertable = true, updatable = true, length = 20)
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Basic
    @Column(name = "regdate", nullable = false, insertable = true, updatable = true)
    public int getRegdate() {
        return regdate;
    }

    public void setRegdate(int regdate) {
        this.regdate = regdate;
    }

    @Basic
    @Column(name = "regip", nullable = false, insertable = true, updatable = true, length = 15)
    public String getRegip() {
        return regip;
    }

    public void setRegip(String regip) {
        this.regip = regip;
    }

    @Basic
    @Column(name = "email", nullable = false, insertable = true, updatable = true, length = 32)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "modelid", nullable = false, insertable = true, updatable = true)
    public byte getModelid() {
        return modelid;
    }

    public void setModelid(byte modelid) {
        this.modelid = modelid;
    }

    @Basic
    @Column(name = "point", nullable = false, insertable = true, updatable = true)
    public short getPoint() {
        return point;
    }

    public void setPoint(short point) {
        this.point = point;
    }

    @Basic
    @Column(name = "amount", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "modelinfo", nullable = false, insertable = true, updatable = true, length = 255)
    public String getModelinfo() {
        return modelinfo;
    }

    public void setModelinfo(String modelinfo) {
        this.modelinfo = modelinfo;
    }

    @Basic
    @Column(name = "status", nullable = false, insertable = true, updatable = true)
    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    @Basic
    @Column(name = "siteid", nullable = false, insertable = true, updatable = true)
    public byte getSiteid() {
        return siteid;
    }

    public void setSiteid(byte siteid) {
        this.siteid = siteid;
    }

    @Basic
    @Column(name = "message", nullable = true, insertable = true, updatable = true, length = 100)
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Basic
    @Column(name = "contacts", nullable = true, insertable = true, updatable = true, length = 10)
    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    @Basic
    @Column(name = "telphone", nullable = true, insertable = true, updatable = true, length = 11)
    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        V9MemberVerify that = (V9MemberVerify) o;

        if (userid != that.userid) return false;
        if (regdate != that.regdate) return false;
        if (modelid != that.modelid) return false;
        if (point != that.point) return false;
        if (status != that.status) return false;
        if (siteid != that.siteid) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (encrypt != null ? !encrypt.equals(that.encrypt) : that.encrypt != null) return false;
        if (nickname != null ? !nickname.equals(that.nickname) : that.nickname != null) return false;
        if (regip != null ? !regip.equals(that.regip) : that.regip != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (modelinfo != null ? !modelinfo.equals(that.modelinfo) : that.modelinfo != null) return false;
        if (message != null ? !message.equals(that.message) : that.message != null) return false;
        if (contacts != null ? !contacts.equals(that.contacts) : that.contacts != null) return false;
        if (telphone != null ? !telphone.equals(that.telphone) : that.telphone != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userid;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (encrypt != null ? encrypt.hashCode() : 0);
        result = 31 * result + (nickname != null ? nickname.hashCode() : 0);
        result = 31 * result + regdate;
        result = 31 * result + (regip != null ? regip.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (int) modelid;
        result = 31 * result + (int) point;
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (modelinfo != null ? modelinfo.hashCode() : 0);
        result = 31 * result + (int) status;
        result = 31 * result + (int) siteid;
        result = 31 * result + (message != null ? message.hashCode() : 0);
        result = 31 * result + (contacts != null ? contacts.hashCode() : 0);
        result = 31 * result + (telphone != null ? telphone.hashCode() : 0);
        return result;
    }
}
