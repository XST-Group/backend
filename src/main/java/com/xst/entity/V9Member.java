package com.xst.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * Created by CrazyCodess on 2016/5/2.
 */
@Entity
@javax.persistence.Table(name = "v9_member", schema = "db_xst_new", catalog = "")
public class V9Member {
    private int userid;

    @Id
    @javax.persistence.Column(name = "userid", nullable = false)
    public int  getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    private String username;

    @Basic
    @javax.persistence.Column(name = "username", nullable = true, length = 100)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String password;

    @Basic
    @javax.persistence.Column(name = "password", nullable = true, length = 32)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String encrypt;

    @Basic
    @javax.persistence.Column(name = "encrypt", nullable = true, length = 6)
    public String getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(String encrypt) {
        this.encrypt = encrypt;
    }

    private String nickname;

    @Basic
    @javax.persistence.Column(name = "nickname", nullable = true, length = 20)
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    private Integer regdate;

    @Basic
    @javax.persistence.Column(name = "regdate", nullable = true)
    public Integer getRegdate() {
        return regdate;
    }

    public void setRegdate(Integer regdate) {
        this.regdate = regdate;
    }

    private Integer lastdate;

    @Basic
    @javax.persistence.Column(name = "lastdate", nullable = true)
    public Integer getLastdate() {
        return lastdate;
    }

    public void setLastdate(Integer lastdate) {
        this.lastdate = lastdate;
    }

    private String regip;

    @Basic
    @javax.persistence.Column(name = "regip", nullable = true, length = 15)
    public String getRegip() {
        return regip;
    }

    public void setRegip(String regip) {
        this.regip = regip;
    }

    private String lastip;

    @Basic
    @javax.persistence.Column(name = "lastip", nullable = true, length = 15)
    public String getLastip() {
        return lastip;
    }

    public void setLastip(String lastip) {
        this.lastip = lastip;
    }

    private Short loginnum;

    @Basic
    @javax.persistence.Column(name = "loginnum", nullable = true)
    public Short getLoginnum() {
        return loginnum;
    }

    public void setLoginnum(Short loginnum) {
        this.loginnum = loginnum;
    }

    private String email;

    @Basic
    @javax.persistence.Column(name = "email", nullable = true, length = 32)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private Byte groupid;

    @Basic
    @javax.persistence.Column(name = "groupid", nullable = true)
    public Byte getGroupid() {
        return groupid;
    }

    public void setGroupid(Byte groupid) {
        this.groupid = groupid;
    }

    private Short areaid;

    @Basic
    @javax.persistence.Column(name = "areaid", nullable = true)
    public Short getAreaid() {
        return areaid;
    }

    public void setAreaid(Short areaid) {
        this.areaid = areaid;
    }

    private BigDecimal amount;

    @Basic
    @javax.persistence.Column(name = "amount", nullable = true, precision = 2)
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    private Short point;

    @Basic
    @javax.persistence.Column(name = "point", nullable = true)
    public Short getPoint() {
        return point;
    }

    public void setPoint(Short point) {
        this.point = point;
    }

    private Short modelid;

    @Basic
    @javax.persistence.Column(name = "modelid", nullable = true)
    public Short getModelid() {
        return modelid;
    }

    public void setModelid(Short modelid) {
        this.modelid = modelid;
    }

    private Byte message;

    @Basic
    @javax.persistence.Column(name = "message", nullable = true)
    public Byte getMessage() {
        return message;
    }

    public void setMessage(Byte message) {
        this.message = message;
    }

    private Byte islock;

    @Basic
    @javax.persistence.Column(name = "islock", nullable = true)
    public Byte getIslock() {
        return islock;
    }

    public void setIslock(Byte islock) {
        this.islock = islock;
    }

    private Byte vip;

    @Basic
    @javax.persistence.Column(name = "vip", nullable = true)
    public Byte getVip() {
        return vip;
    }

    public void setVip(Byte vip) {
        this.vip = vip;
    }

    private Integer overduedate;

    @Basic
    @javax.persistence.Column(name = "overduedate", nullable = true)
    public Integer getOverduedate() {
        return overduedate;
    }

    public void setOverduedate(Integer overduedate) {
        this.overduedate = overduedate;
    }

    private Short siteid;

    @Basic
    @javax.persistence.Column(name = "siteid", nullable = true)
    public Short getSiteid() {
        return siteid;
    }

    public void setSiteid(Short siteid) {
        this.siteid = siteid;
    }

    private String uparent;

    @Basic
    @javax.persistence.Column(name = "Uparent", nullable = true, length = 20)
    public String getUparent() {
        return uparent;
    }

    public void setUparent(String uparent) {
        this.uparent = uparent;
    }

    private Integer utype;

    @Basic
    @javax.persistence.Column(name = "Utype", nullable = true)
    public Integer getUtype() {
        return utype;
    }

    public void setUtype(Integer utype) {
        this.utype = utype;
    }

    private Integer ustate;

    @Basic
    @javax.persistence.Column(name = "Ustate", nullable = true)
    public Integer getUstate() {
        return ustate;
    }

    public void setUstate(Integer ustate) {
        this.ustate = ustate;
    }

    private String utel;

    @Basic
    @javax.persistence.Column(name = "Utel", nullable = true, length = 20)
    public String getUtel() {
        return utel;
    }

    public void setUtel(String utel) {
        this.utel = utel;
    }

    private String ubegin;

    @Basic
    @javax.persistence.Column(name = "Ubegin", nullable = true, length = 30)
    public String getUbegin() {
        return ubegin;
    }

    public void setUbegin(String ubegin) {
        this.ubegin = ubegin;
    }

    private String upower;

    @Basic
    @javax.persistence.Column(name = "Upower", nullable = true, length = 30)
    public String getUpower() {
        return upower;
    }

    public void setUpower(String upower) {
        this.upower = upower;
    }

    private String ucraete;

    @Basic
    @javax.persistence.Column(name = "Ucraete", nullable = true, length = 30)
    public String getUcraete() {
        return ucraete;
    }

    public void setUcraete(String ucraete) {
        this.ucraete = ucraete;
    }

    private String ustart;

    @Basic
    @javax.persistence.Column(name = "Ustart", nullable = true, length = 20)
    public String getUstart() {
        return ustart;
    }

    public void setUstart(String ustart) {
        this.ustart = ustart;
    }

    private String ustop;

    @Basic
    @javax.persistence.Column(name = "Ustop", nullable = true, length = 20)
    public String getUstop() {
        return ustop;
    }

    public void setUstop(String ustop) {
        this.ustop = ustop;
    }

    private String ugroup;

    @Basic
    @javax.persistence.Column(name = "Ugroup", nullable = true, length = 10)
    public String getUgroup() {
        return ugroup;
    }

    public void setUgroup(String ugroup) {
        this.ugroup = ugroup;
    }

    private String ulockip;

    @Basic
    @javax.persistence.Column(name = "Ulockip", nullable = true, length = 255)
    public String getUlockip() {
        return ulockip;
    }

    public void setUlockip(String ulockip) {
        this.ulockip = ulockip;
    }

    private String urequest;

    @Basic
    @javax.persistence.Column(name = "Urequest", nullable = true, length = 255)
    public String getUrequest() {
        return urequest;
    }

    public void setUrequest(String urequest) {
        this.urequest = urequest;
    }

    private String uanswer;

    @Basic
    @javax.persistence.Column(name = "Uanswer", nullable = true, length = 255)
    public String getUanswer() {
        return uanswer;
    }

    public void setUanswer(String uanswer) {
        this.uanswer = uanswer;
    }

    private String ugrade;

    @Basic
    @javax.persistence.Column(name = "Ugrade", nullable = true, length = 100)
    public String getUgrade() {
        return ugrade;
    }

    public void setUgrade(String ugrade) {
        this.ugrade = ugrade;
    }

    private String uoffice;

    @Basic
    @javax.persistence.Column(name = "Uoffice", nullable = true, length = 100)
    public String getUoffice() {
        return uoffice;
    }

    public void setUoffice(String uoffice) {
        this.uoffice = uoffice;
    }

    private String uorgan;

    @Basic
    @javax.persistence.Column(name = "Uorgan", nullable = true, length = 100)
    public String getUorgan() {
        return uorgan;
    }

    public void setUorgan(String uorgan) {
        this.uorgan = uorgan;
    }

    private String repass;

    @Basic
    @javax.persistence.Column(name = "repass", nullable = true, length = 100)
    public String getRepass() {
        return repass;
    }

    public void setRepass(String repass) {
        this.repass = repass;
    }

    private Integer totaltime;

    @Basic
    @javax.persistence.Column(name = "totaltime", nullable = true)
    public Integer getTotaltime() {
        return totaltime;
    }

    public void setTotaltime(Integer totaltime) {
        this.totaltime = totaltime;
    }

    private Integer relAdminUserid;

    @Basic
    @javax.persistence.Column(name = "rel_admin_userid", nullable = true)
    public Integer getRelAdminUserid() {
        return relAdminUserid;
    }

    public void setRelAdminUserid(Integer relAdminUserid) {
        this.relAdminUserid = relAdminUserid;
    }

    private String relAdminUsername;

    @Basic
    @javax.persistence.Column(name = "rel_admin_username", nullable = true, length = 30)
    public String getRelAdminUsername() {
        return relAdminUsername;
    }

    public void setRelAdminUsername(String relAdminUsername) {
        this.relAdminUsername = relAdminUsername;
    }

    private String contacts;

    @Basic
    @javax.persistence.Column(name = "contacts", nullable = true, length = 50)
    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    private String qq;

    @Basic
    @javax.persistence.Column(name = "qq", nullable = true, length = 20)
    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    private String telphone;

    @Basic
    @javax.persistence.Column(name = "telphone", nullable = true, length = 11)
    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    private String schoolmaster;

    @Basic
    @javax.persistence.Column(name = "schoolmaster", nullable = true, length = 30)
    public String getSchoolmaster() {
        return schoolmaster;
    }

    public void setSchoolmaster(String schoolmaster) {
        this.schoolmaster = schoolmaster;
    }

    private String schoolAddress;

    @Basic
    @javax.persistence.Column(name = "school_address", nullable = true, length = 100)
    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    private Double servicemoney;

    @Basic
    @javax.persistence.Column(name = "servicemoney", nullable = true, precision = 0)
    public Double getServicemoney() {
        return servicemoney;
    }

    public void setServicemoney(Double servicemoney) {
        this.servicemoney = servicemoney;
    }

    private String invoicetitle;

    @Basic
    @javax.persistence.Column(name = "invoicetitle", nullable = true, length = 50)
    public String getInvoicetitle() {
        return invoicetitle;
    }

    public void setInvoicetitle(String invoicetitle) {
        this.invoicetitle = invoicetitle;
    }

    private String postalcode;

    @Basic
    @javax.persistence.Column(name = "postalcode", nullable = true, length = 10)
    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    private Date renewtime;

    @Basic
    @javax.persistence.Column(name = "renewtime", nullable = true)
    public Date getRenewtime() {
        return renewtime;
    }

    public void setRenewtime(Date renewtime) {
        this.renewtime = renewtime;
    }

    private String remark;

    @Basic
    @javax.persistence.Column(name = "remark", nullable = true, length = -1)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    private Byte vouchStatus;

    @Basic
    @javax.persistence.Column(name = "vouch_status", nullable = true)
    public Byte getVouchStatus() {
        return vouchStatus;
    }

    public void setVouchStatus(Byte vouchStatus) {
        this.vouchStatus = vouchStatus;
    }

    private Date vouchTime;

    @Basic
    @javax.persistence.Column(name = "vouch_time", nullable = true)
    public Date getVouchTime() {
        return vouchTime;
    }

    public void setVouchTime(Date vouchTime) {
        this.vouchTime = vouchTime;
    }

    private Integer ktdate;

    @Basic
    @javax.persistence.Column(name = "ktdate", nullable = true)
    public Integer getKtdate() {
        return ktdate;
    }

    public void setKtdate(Integer ktdate) {
        this.ktdate = ktdate;
    }

    private Byte relBank;

    @Basic
    @javax.persistence.Column(name = "rel_bank", nullable = true)
    public Byte getRelBank() {
        return relBank;
    }

    public void setRelBank(Byte relBank) {
        this.relBank = relBank;
    }

    private String moneyInfo;

    @Basic
    @javax.persistence.Column(name = "money_info", nullable = true, length = -1)
    public String getMoneyInfo() {
        return moneyInfo;
    }

    public void setMoneyInfo(String moneyInfo) {
        this.moneyInfo = moneyInfo;
    }

    private String visitOpinion;

    @Basic
    @javax.persistence.Column(name = "visit_opinion", nullable = true, length = -1)
    public String getVisitOpinion() {
        return visitOpinion;
    }

    public void setVisitOpinion(String visitOpinion) {
        this.visitOpinion = visitOpinion;
    }

    private String verify;

    @Basic
    @javax.persistence.Column(name = "verify", nullable = true)
    public String getVerify() {
        return verify;
    }

    public void setVerify(String verify) {
        this.verify = verify;
    }

    public V9Member() {
    }

    public V9Member(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        V9Member v9Member = (V9Member) o;

        if (userid != v9Member.userid) return false;
        if (!username.equals(v9Member.username)) return false;
        if (!password.equals(v9Member.password)) return false;
        if (!encrypt.equals(v9Member.encrypt)) return false;
        if (!nickname.equals(v9Member.nickname)) return false;
        if (!regdate.equals(v9Member.regdate)) return false;
        if (!lastdate.equals(v9Member.lastdate)) return false;
        if (!regip.equals(v9Member.regip)) return false;
        if (!lastip.equals(v9Member.lastip)) return false;
        if (!loginnum.equals(v9Member.loginnum)) return false;
        if (!email.equals(v9Member.email)) return false;
        if (!groupid.equals(v9Member.groupid)) return false;
        if (!areaid.equals(v9Member.areaid)) return false;
        if (!amount.equals(v9Member.amount)) return false;
        if (!point.equals(v9Member.point)) return false;
        if (!modelid.equals(v9Member.modelid)) return false;
        if (!message.equals(v9Member.message)) return false;
        if (!islock.equals(v9Member.islock)) return false;
        if (!vip.equals(v9Member.vip)) return false;
        if (!overduedate.equals(v9Member.overduedate)) return false;
        if (!siteid.equals(v9Member.siteid)) return false;
        if (!uparent.equals(v9Member.uparent)) return false;
        if (!utype.equals(v9Member.utype)) return false;
        if (!ustate.equals(v9Member.ustate)) return false;
        if (!utel.equals(v9Member.utel)) return false;
        if (!ubegin.equals(v9Member.ubegin)) return false;
        if (!upower.equals(v9Member.upower)) return false;
        if (!ucraete.equals(v9Member.ucraete)) return false;
        if (!ustart.equals(v9Member.ustart)) return false;
        if (!ustop.equals(v9Member.ustop)) return false;
        if (!ugroup.equals(v9Member.ugroup)) return false;
        if (!ulockip.equals(v9Member.ulockip)) return false;
        if (!urequest.equals(v9Member.urequest)) return false;
        if (!uanswer.equals(v9Member.uanswer)) return false;
        if (!ugrade.equals(v9Member.ugrade)) return false;
        if (!uoffice.equals(v9Member.uoffice)) return false;
        if (!uorgan.equals(v9Member.uorgan)) return false;
        if (!repass.equals(v9Member.repass)) return false;
        if (!totaltime.equals(v9Member.totaltime)) return false;
        if (!relAdminUserid.equals(v9Member.relAdminUserid)) return false;
        if (!relAdminUsername.equals(v9Member.relAdminUsername)) return false;
        if (!contacts.equals(v9Member.contacts)) return false;
        if (!qq.equals(v9Member.qq)) return false;
        if (!telphone.equals(v9Member.telphone)) return false;
        if (!schoolmaster.equals(v9Member.schoolmaster)) return false;
        if (!schoolAddress.equals(v9Member.schoolAddress)) return false;
        if (!servicemoney.equals(v9Member.servicemoney)) return false;
        if (!invoicetitle.equals(v9Member.invoicetitle)) return false;
        if (!postalcode.equals(v9Member.postalcode)) return false;
        if (!renewtime.equals(v9Member.renewtime)) return false;
        if (!remark.equals(v9Member.remark)) return false;
        if (!vouchStatus.equals(v9Member.vouchStatus)) return false;
        if (!vouchTime.equals(v9Member.vouchTime)) return false;
        if (!ktdate.equals(v9Member.ktdate)) return false;
        if (!relBank.equals(v9Member.relBank)) return false;
        if (!moneyInfo.equals(v9Member.moneyInfo)) return false;
        if (!visitOpinion.equals(v9Member.visitOpinion)) return false;
        return verify.equals(v9Member.verify);

    }

    @Override
    public int hashCode() {
        int result = userid;
        result = 31 * result + username.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + encrypt.hashCode();
        result = 31 * result + nickname.hashCode();
        result = 31 * result + regdate.hashCode();
        result = 31 * result + lastdate.hashCode();
        result = 31 * result + regip.hashCode();
        result = 31 * result + lastip.hashCode();
        result = 31 * result + loginnum.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + groupid.hashCode();
        result = 31 * result + areaid.hashCode();
        result = 31 * result + amount.hashCode();
        result = 31 * result + point.hashCode();
        result = 31 * result + modelid.hashCode();
        result = 31 * result + message.hashCode();
        result = 31 * result + islock.hashCode();
        result = 31 * result + vip.hashCode();
        result = 31 * result + overduedate.hashCode();
        result = 31 * result + siteid.hashCode();
        result = 31 * result + uparent.hashCode();
        result = 31 * result + utype.hashCode();
        result = 31 * result + ustate.hashCode();
        result = 31 * result + utel.hashCode();
        result = 31 * result + ubegin.hashCode();
        result = 31 * result + upower.hashCode();
        result = 31 * result + ucraete.hashCode();
        result = 31 * result + ustart.hashCode();
        result = 31 * result + ustop.hashCode();
        result = 31 * result + ugroup.hashCode();
        result = 31 * result + ulockip.hashCode();
        result = 31 * result + urequest.hashCode();
        result = 31 * result + uanswer.hashCode();
        result = 31 * result + ugrade.hashCode();
        result = 31 * result + uoffice.hashCode();
        result = 31 * result + uorgan.hashCode();
        result = 31 * result + repass.hashCode();
        result = 31 * result + totaltime.hashCode();
        result = 31 * result + relAdminUserid.hashCode();
        result = 31 * result + relAdminUsername.hashCode();
        result = 31 * result + contacts.hashCode();
        result = 31 * result + qq.hashCode();
        result = 31 * result + telphone.hashCode();
        result = 31 * result + schoolmaster.hashCode();
        result = 31 * result + schoolAddress.hashCode();
        result = 31 * result + servicemoney.hashCode();
        result = 31 * result + invoicetitle.hashCode();
        result = 31 * result + postalcode.hashCode();
        result = 31 * result + renewtime.hashCode();
        result = 31 * result + remark.hashCode();
        result = 31 * result + vouchStatus.hashCode();
        result = 31 * result + vouchTime.hashCode();
        result = 31 * result + ktdate.hashCode();
        result = 31 * result + relBank.hashCode();
        result = 31 * result + moneyInfo.hashCode();
        result = 31 * result + visitOpinion.hashCode();
        result = 31 * result + verify.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "V9Member{" +
                "verify=" + verify +
                ", userid=" + userid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", encrypt='" + encrypt + '\'' +
                ", nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
