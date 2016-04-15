package com.xst.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * Created by sl on 16-4-15.
 */
@Entity
@javax.persistence.Table(name = "v9_member", schema = "", catalog = "db_xst_new")
public class V9Member {
    private int userid;

    @Id
    @javax.persistence.Column(name = "userid", nullable = false, insertable = true, updatable = true)
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    private int phpssouid;

    @Basic
    @javax.persistence.Column(name = "phpssouid", nullable = false, insertable = true, updatable = true)
    public int getPhpssouid() {
        return phpssouid;
    }

    public void setPhpssouid(int phpssouid) {
        this.phpssouid = phpssouid;
    }

    private String username;

    @Basic
    @javax.persistence.Column(name = "username", nullable = true, insertable = true, updatable = true, length = 100)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String password;

    @Basic
    @javax.persistence.Column(name = "password", nullable = false, insertable = true, updatable = true, length = 32)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String encrypt;

    @Basic
    @javax.persistence.Column(name = "encrypt", nullable = false, insertable = true, updatable = true, length = 6)
    public String getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(String encrypt) {
        this.encrypt = encrypt;
    }

    private String nickname;

    @Basic
    @javax.persistence.Column(name = "nickname", nullable = false, insertable = true, updatable = true, length = 20)
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    private int regdate;

    @Basic
    @javax.persistence.Column(name = "regdate", nullable = false, insertable = true, updatable = true)
    public int getRegdate() {
        return regdate;
    }

    public void setRegdate(int regdate) {
        this.regdate = regdate;
    }

    private int lastdate;

    @Basic
    @javax.persistence.Column(name = "lastdate", nullable = false, insertable = true, updatable = true)
    public int getLastdate() {
        return lastdate;
    }

    public void setLastdate(int lastdate) {
        this.lastdate = lastdate;
    }

    private String regip;

    @Basic
    @javax.persistence.Column(name = "regip", nullable = false, insertable = true, updatable = true, length = 15)
    public String getRegip() {
        return regip;
    }

    public void setRegip(String regip) {
        this.regip = regip;
    }

    private String lastip;

    @Basic
    @javax.persistence.Column(name = "lastip", nullable = false, insertable = true, updatable = true, length = 15)
    public String getLastip() {
        return lastip;
    }

    public void setLastip(String lastip) {
        this.lastip = lastip;
    }

    private short loginnum;

    @Basic
    @javax.persistence.Column(name = "loginnum", nullable = false, insertable = true, updatable = true)
    public short getLoginnum() {
        return loginnum;
    }

    public void setLoginnum(short loginnum) {
        this.loginnum = loginnum;
    }

    private String email;

    @Basic
    @javax.persistence.Column(name = "email", nullable = false, insertable = true, updatable = true, length = 32)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private byte groupid;

    @Basic
    @javax.persistence.Column(name = "groupid", nullable = false, insertable = true, updatable = true)
    public byte getGroupid() {
        return groupid;
    }

    public void setGroupid(byte groupid) {
        this.groupid = groupid;
    }

    private short areaid;

    @Basic
    @javax.persistence.Column(name = "areaid", nullable = false, insertable = true, updatable = true)
    public short getAreaid() {
        return areaid;
    }

    public void setAreaid(short areaid) {
        this.areaid = areaid;
    }

    private BigDecimal amount;

    @Basic
    @javax.persistence.Column(name = "amount", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    private short point;

    @Basic
    @javax.persistence.Column(name = "point", nullable = false, insertable = true, updatable = true)
    public short getPoint() {
        return point;
    }

    public void setPoint(short point) {
        this.point = point;
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

    private byte message;

    @Basic
    @javax.persistence.Column(name = "message", nullable = false, insertable = true, updatable = true)
    public byte getMessage() {
        return message;
    }

    public void setMessage(byte message) {
        this.message = message;
    }

    private byte islock;

    @Basic
    @javax.persistence.Column(name = "islock", nullable = false, insertable = true, updatable = true)
    public byte getIslock() {
        return islock;
    }

    public void setIslock(byte islock) {
        this.islock = islock;
    }

    private byte vip;

    @Basic
    @javax.persistence.Column(name = "vip", nullable = false, insertable = true, updatable = true)
    public byte getVip() {
        return vip;
    }

    public void setVip(byte vip) {
        this.vip = vip;
    }

    private int overduedate;

    @Basic
    @javax.persistence.Column(name = "overduedate", nullable = false, insertable = true, updatable = true)
    public int getOverduedate() {
        return overduedate;
    }

    public void setOverduedate(int overduedate) {
        this.overduedate = overduedate;
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

    private String uparent;

    @Basic
    @javax.persistence.Column(name = "Uparent", nullable = true, insertable = true, updatable = true, length = 20)
    public String getUparent() {
        return uparent;
    }

    public void setUparent(String uparent) {
        this.uparent = uparent;
    }

    private Integer utype;

    @Basic
    @javax.persistence.Column(name = "Utype", nullable = true, insertable = true, updatable = true)
    public Integer getUtype() {
        return utype;
    }

    public void setUtype(Integer utype) {
        this.utype = utype;
    }

    private Integer ustate;

    @Basic
    @javax.persistence.Column(name = "Ustate", nullable = true, insertable = true, updatable = true)
    public Integer getUstate() {
        return ustate;
    }

    public void setUstate(Integer ustate) {
        this.ustate = ustate;
    }

    private String utel;

    @Basic
    @javax.persistence.Column(name = "Utel", nullable = true, insertable = true, updatable = true, length = 20)
    public String getUtel() {
        return utel;
    }

    public void setUtel(String utel) {
        this.utel = utel;
    }

    private String ubegin;

    @Basic
    @javax.persistence.Column(name = "Ubegin", nullable = true, insertable = true, updatable = true, length = 30)
    public String getUbegin() {
        return ubegin;
    }

    public void setUbegin(String ubegin) {
        this.ubegin = ubegin;
    }

    private String upower;

    @Basic
    @javax.persistence.Column(name = "Upower", nullable = true, insertable = true, updatable = true, length = 30)
    public String getUpower() {
        return upower;
    }

    public void setUpower(String upower) {
        this.upower = upower;
    }

    private String ucraete;

    @Basic
    @javax.persistence.Column(name = "Ucraete", nullable = true, insertable = true, updatable = true, length = 30)
    public String getUcraete() {
        return ucraete;
    }

    public void setUcraete(String ucraete) {
        this.ucraete = ucraete;
    }

    private String ustart;

    @Basic
    @javax.persistence.Column(name = "Ustart", nullable = true, insertable = true, updatable = true, length = 20)
    public String getUstart() {
        return ustart;
    }

    public void setUstart(String ustart) {
        this.ustart = ustart;
    }

    private String ustop;

    @Basic
    @javax.persistence.Column(name = "Ustop", nullable = true, insertable = true, updatable = true, length = 20)
    public String getUstop() {
        return ustop;
    }

    public void setUstop(String ustop) {
        this.ustop = ustop;
    }

    private String ugroup;

    @Basic
    @javax.persistence.Column(name = "Ugroup", nullable = true, insertable = true, updatable = true, length = 10)
    public String getUgroup() {
        return ugroup;
    }

    public void setUgroup(String ugroup) {
        this.ugroup = ugroup;
    }

    private String ulockip;

    @Basic
    @javax.persistence.Column(name = "Ulockip", nullable = true, insertable = true, updatable = true, length = 255)
    public String getUlockip() {
        return ulockip;
    }

    public void setUlockip(String ulockip) {
        this.ulockip = ulockip;
    }

    private String urequest;

    @Basic
    @javax.persistence.Column(name = "Urequest", nullable = true, insertable = true, updatable = true, length = 255)
    public String getUrequest() {
        return urequest;
    }

    public void setUrequest(String urequest) {
        this.urequest = urequest;
    }

    private String uanswer;

    @Basic
    @javax.persistence.Column(name = "Uanswer", nullable = true, insertable = true, updatable = true, length = 255)
    public String getUanswer() {
        return uanswer;
    }

    public void setUanswer(String uanswer) {
        this.uanswer = uanswer;
    }

    private String ugrade;

    @Basic
    @javax.persistence.Column(name = "Ugrade", nullable = true, insertable = true, updatable = true, length = 100)
    public String getUgrade() {
        return ugrade;
    }

    public void setUgrade(String ugrade) {
        this.ugrade = ugrade;
    }

    private String uoffice;

    @Basic
    @javax.persistence.Column(name = "Uoffice", nullable = true, insertable = true, updatable = true, length = 100)
    public String getUoffice() {
        return uoffice;
    }

    public void setUoffice(String uoffice) {
        this.uoffice = uoffice;
    }

    private String uorgan;

    @Basic
    @javax.persistence.Column(name = "Uorgan", nullable = true, insertable = true, updatable = true, length = 100)
    public String getUorgan() {
        return uorgan;
    }

    public void setUorgan(String uorgan) {
        this.uorgan = uorgan;
    }

    private String repass;

    @Basic
    @javax.persistence.Column(name = "repass", nullable = true, insertable = true, updatable = true, length = 100)
    public String getRepass() {
        return repass;
    }

    public void setRepass(String repass) {
        this.repass = repass;
    }

    private Integer totaltime;

    @Basic
    @javax.persistence.Column(name = "totaltime", nullable = true, insertable = true, updatable = true)
    public Integer getTotaltime() {
        return totaltime;
    }

    public void setTotaltime(Integer totaltime) {
        this.totaltime = totaltime;
    }

    private int relAdminUserid;

    @Basic
    @javax.persistence.Column(name = "rel_admin_userid", nullable = false, insertable = true, updatable = true)
    public int getRelAdminUserid() {
        return relAdminUserid;
    }

    public void setRelAdminUserid(int relAdminUserid) {
        this.relAdminUserid = relAdminUserid;
    }

    private String relAdminUsername;

    @Basic
    @javax.persistence.Column(name = "rel_admin_username", nullable = false, insertable = true, updatable = true, length = 30)
    public String getRelAdminUsername() {
        return relAdminUsername;
    }

    public void setRelAdminUsername(String relAdminUsername) {
        this.relAdminUsername = relAdminUsername;
    }

    private String contacts;

    @Basic
    @javax.persistence.Column(name = "contacts", nullable = true, insertable = true, updatable = true, length = 50)
    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    private String qq;

    @Basic
    @javax.persistence.Column(name = "qq", nullable = true, insertable = true, updatable = true, length = 20)
    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    private String telphone;

    @Basic
    @javax.persistence.Column(name = "telphone", nullable = true, insertable = true, updatable = true, length = 11)
    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    private String schoolmaster;

    @Basic
    @javax.persistence.Column(name = "schoolmaster", nullable = true, insertable = true, updatable = true, length = 30)
    public String getSchoolmaster() {
        return schoolmaster;
    }

    public void setSchoolmaster(String schoolmaster) {
        this.schoolmaster = schoolmaster;
    }

    private String schoolAddress;

    @Basic
    @javax.persistence.Column(name = "school_address", nullable = true, insertable = true, updatable = true, length = 100)
    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    private Float servicemoney;

    @Basic
    @javax.persistence.Column(name = "servicemoney", nullable = true, insertable = true, updatable = true, precision = 0)
    public Float getServicemoney() {
        return servicemoney;
    }

    public void setServicemoney(Float servicemoney) {
        this.servicemoney = servicemoney;
    }

    private String invoicetitle;

    @Basic
    @javax.persistence.Column(name = "invoicetitle", nullable = true, insertable = true, updatable = true, length = 50)
    public String getInvoicetitle() {
        return invoicetitle;
    }

    public void setInvoicetitle(String invoicetitle) {
        this.invoicetitle = invoicetitle;
    }

    private String postalcode;

    @Basic
    @javax.persistence.Column(name = "postalcode", nullable = true, insertable = true, updatable = true, length = 10)
    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    private Date renewtime;

    @Basic
    @javax.persistence.Column(name = "renewtime", nullable = true, insertable = true, updatable = true)
    public Date getRenewtime() {
        return renewtime;
    }

    public void setRenewtime(Date renewtime) {
        this.renewtime = renewtime;
    }

    private String remark;

    @Basic
    @javax.persistence.Column(name = "remark", nullable = true, insertable = true, updatable = true, length = 65535)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    private Byte vouchStatus;

    @Basic
    @javax.persistence.Column(name = "vouch_status", nullable = true, insertable = true, updatable = true)
    public Byte getVouchStatus() {
        return vouchStatus;
    }

    public void setVouchStatus(Byte vouchStatus) {
        this.vouchStatus = vouchStatus;
    }

    private Date vouchTime;

    @Basic
    @javax.persistence.Column(name = "vouch_time", nullable = true, insertable = true, updatable = true)
    public Date getVouchTime() {
        return vouchTime;
    }

    public void setVouchTime(Date vouchTime) {
        this.vouchTime = vouchTime;
    }

    private int ktdate;

    @Basic
    @javax.persistence.Column(name = "ktdate", nullable = false, insertable = true, updatable = true)
    public int getKtdate() {
        return ktdate;
    }

    public void setKtdate(int ktdate) {
        this.ktdate = ktdate;
    }

    private byte relBank;

    @Basic
    @javax.persistence.Column(name = "rel_bank", nullable = false, insertable = true, updatable = true)
    public byte getRelBank() {
        return relBank;
    }

    public void setRelBank(byte relBank) {
        this.relBank = relBank;
    }

    private String moneyInfo;

    @Basic
    @javax.persistence.Column(name = "money_info", nullable = false, insertable = true, updatable = true, length = 65535)
    public String getMoneyInfo() {
        return moneyInfo;
    }

    public void setMoneyInfo(String moneyInfo) {
        this.moneyInfo = moneyInfo;
    }

    private String visitOpinion;

    @Basic
    @javax.persistence.Column(name = "visit_opinion", nullable = false, insertable = true, updatable = true, length = 65535)
    public String getVisitOpinion() {
        return visitOpinion;
    }

    public void setVisitOpinion(String visitOpinion) {
        this.visitOpinion = visitOpinion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        V9Member v9Member = (V9Member) o;

        if (userid != v9Member.userid) return false;
        if (phpssouid != v9Member.phpssouid) return false;
        if (regdate != v9Member.regdate) return false;
        if (lastdate != v9Member.lastdate) return false;
        if (loginnum != v9Member.loginnum) return false;
        if (groupid != v9Member.groupid) return false;
        if (areaid != v9Member.areaid) return false;
        if (point != v9Member.point) return false;
        if (modelid != v9Member.modelid) return false;
        if (message != v9Member.message) return false;
        if (islock != v9Member.islock) return false;
        if (vip != v9Member.vip) return false;
        if (overduedate != v9Member.overduedate) return false;
        if (siteid != v9Member.siteid) return false;
        if (relAdminUserid != v9Member.relAdminUserid) return false;
        if (ktdate != v9Member.ktdate) return false;
        if (relBank != v9Member.relBank) return false;
        if (username != null ? !username.equals(v9Member.username) : v9Member.username != null) return false;
        if (password != null ? !password.equals(v9Member.password) : v9Member.password != null) return false;
        if (encrypt != null ? !encrypt.equals(v9Member.encrypt) : v9Member.encrypt != null) return false;
        if (nickname != null ? !nickname.equals(v9Member.nickname) : v9Member.nickname != null) return false;
        if (regip != null ? !regip.equals(v9Member.regip) : v9Member.regip != null) return false;
        if (lastip != null ? !lastip.equals(v9Member.lastip) : v9Member.lastip != null) return false;
        if (email != null ? !email.equals(v9Member.email) : v9Member.email != null) return false;
        if (amount != null ? !amount.equals(v9Member.amount) : v9Member.amount != null) return false;
        if (uparent != null ? !uparent.equals(v9Member.uparent) : v9Member.uparent != null) return false;
        if (utype != null ? !utype.equals(v9Member.utype) : v9Member.utype != null) return false;
        if (ustate != null ? !ustate.equals(v9Member.ustate) : v9Member.ustate != null) return false;
        if (utel != null ? !utel.equals(v9Member.utel) : v9Member.utel != null) return false;
        if (ubegin != null ? !ubegin.equals(v9Member.ubegin) : v9Member.ubegin != null) return false;
        if (upower != null ? !upower.equals(v9Member.upower) : v9Member.upower != null) return false;
        if (ucraete != null ? !ucraete.equals(v9Member.ucraete) : v9Member.ucraete != null) return false;
        if (ustart != null ? !ustart.equals(v9Member.ustart) : v9Member.ustart != null) return false;
        if (ustop != null ? !ustop.equals(v9Member.ustop) : v9Member.ustop != null) return false;
        if (ugroup != null ? !ugroup.equals(v9Member.ugroup) : v9Member.ugroup != null) return false;
        if (ulockip != null ? !ulockip.equals(v9Member.ulockip) : v9Member.ulockip != null) return false;
        if (urequest != null ? !urequest.equals(v9Member.urequest) : v9Member.urequest != null) return false;
        if (uanswer != null ? !uanswer.equals(v9Member.uanswer) : v9Member.uanswer != null) return false;
        if (ugrade != null ? !ugrade.equals(v9Member.ugrade) : v9Member.ugrade != null) return false;
        if (uoffice != null ? !uoffice.equals(v9Member.uoffice) : v9Member.uoffice != null) return false;
        if (uorgan != null ? !uorgan.equals(v9Member.uorgan) : v9Member.uorgan != null) return false;
        if (repass != null ? !repass.equals(v9Member.repass) : v9Member.repass != null) return false;
        if (totaltime != null ? !totaltime.equals(v9Member.totaltime) : v9Member.totaltime != null) return false;
        if (relAdminUsername != null ? !relAdminUsername.equals(v9Member.relAdminUsername) : v9Member.relAdminUsername != null)
            return false;
        if (contacts != null ? !contacts.equals(v9Member.contacts) : v9Member.contacts != null) return false;
        if (qq != null ? !qq.equals(v9Member.qq) : v9Member.qq != null) return false;
        if (telphone != null ? !telphone.equals(v9Member.telphone) : v9Member.telphone != null) return false;
        if (schoolmaster != null ? !schoolmaster.equals(v9Member.schoolmaster) : v9Member.schoolmaster != null)
            return false;
        if (schoolAddress != null ? !schoolAddress.equals(v9Member.schoolAddress) : v9Member.schoolAddress != null)
            return false;
        if (servicemoney != null ? !servicemoney.equals(v9Member.servicemoney) : v9Member.servicemoney != null)
            return false;
        if (invoicetitle != null ? !invoicetitle.equals(v9Member.invoicetitle) : v9Member.invoicetitle != null)
            return false;
        if (postalcode != null ? !postalcode.equals(v9Member.postalcode) : v9Member.postalcode != null) return false;
        if (renewtime != null ? !renewtime.equals(v9Member.renewtime) : v9Member.renewtime != null) return false;
        if (remark != null ? !remark.equals(v9Member.remark) : v9Member.remark != null) return false;
        if (vouchStatus != null ? !vouchStatus.equals(v9Member.vouchStatus) : v9Member.vouchStatus != null)
            return false;
        if (vouchTime != null ? !vouchTime.equals(v9Member.vouchTime) : v9Member.vouchTime != null) return false;
        if (moneyInfo != null ? !moneyInfo.equals(v9Member.moneyInfo) : v9Member.moneyInfo != null) return false;
        if (visitOpinion != null ? !visitOpinion.equals(v9Member.visitOpinion) : v9Member.visitOpinion != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userid;
        result = 31 * result + phpssouid;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (encrypt != null ? encrypt.hashCode() : 0);
        result = 31 * result + (nickname != null ? nickname.hashCode() : 0);
        result = 31 * result + regdate;
        result = 31 * result + lastdate;
        result = 31 * result + (regip != null ? regip.hashCode() : 0);
        result = 31 * result + (lastip != null ? lastip.hashCode() : 0);
        result = 31 * result + (int) loginnum;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (int) groupid;
        result = 31 * result + (int) areaid;
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (int) point;
        result = 31 * result + (int) modelid;
        result = 31 * result + (int) message;
        result = 31 * result + (int) islock;
        result = 31 * result + (int) vip;
        result = 31 * result + overduedate;
        result = 31 * result + (int) siteid;
        result = 31 * result + (uparent != null ? uparent.hashCode() : 0);
        result = 31 * result + (utype != null ? utype.hashCode() : 0);
        result = 31 * result + (ustate != null ? ustate.hashCode() : 0);
        result = 31 * result + (utel != null ? utel.hashCode() : 0);
        result = 31 * result + (ubegin != null ? ubegin.hashCode() : 0);
        result = 31 * result + (upower != null ? upower.hashCode() : 0);
        result = 31 * result + (ucraete != null ? ucraete.hashCode() : 0);
        result = 31 * result + (ustart != null ? ustart.hashCode() : 0);
        result = 31 * result + (ustop != null ? ustop.hashCode() : 0);
        result = 31 * result + (ugroup != null ? ugroup.hashCode() : 0);
        result = 31 * result + (ulockip != null ? ulockip.hashCode() : 0);
        result = 31 * result + (urequest != null ? urequest.hashCode() : 0);
        result = 31 * result + (uanswer != null ? uanswer.hashCode() : 0);
        result = 31 * result + (ugrade != null ? ugrade.hashCode() : 0);
        result = 31 * result + (uoffice != null ? uoffice.hashCode() : 0);
        result = 31 * result + (uorgan != null ? uorgan.hashCode() : 0);
        result = 31 * result + (repass != null ? repass.hashCode() : 0);
        result = 31 * result + (totaltime != null ? totaltime.hashCode() : 0);
        result = 31 * result + relAdminUserid;
        result = 31 * result + (relAdminUsername != null ? relAdminUsername.hashCode() : 0);
        result = 31 * result + (contacts != null ? contacts.hashCode() : 0);
        result = 31 * result + (qq != null ? qq.hashCode() : 0);
        result = 31 * result + (telphone != null ? telphone.hashCode() : 0);
        result = 31 * result + (schoolmaster != null ? schoolmaster.hashCode() : 0);
        result = 31 * result + (schoolAddress != null ? schoolAddress.hashCode() : 0);
        result = 31 * result + (servicemoney != null ? servicemoney.hashCode() : 0);
        result = 31 * result + (invoicetitle != null ? invoicetitle.hashCode() : 0);
        result = 31 * result + (postalcode != null ? postalcode.hashCode() : 0);
        result = 31 * result + (renewtime != null ? renewtime.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (vouchStatus != null ? vouchStatus.hashCode() : 0);
        result = 31 * result + (vouchTime != null ? vouchTime.hashCode() : 0);
        result = 31 * result + ktdate;
        result = 31 * result + (int) relBank;
        result = 31 * result + (moneyInfo != null ? moneyInfo.hashCode() : 0);
        result = 31 * result + (visitOpinion != null ? visitOpinion.hashCode() : 0);
        return result;
    }
}
