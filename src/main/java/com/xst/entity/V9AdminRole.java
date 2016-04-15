package com.xst.entity;

import javax.persistence.*;

/**
 * Created by sl on 16-4-15.
 */
@Entity
@Table(name = "v9_admin_role", schema = "", catalog = "db_xst_new")
public class V9AdminRole {
    private byte roleid;
    private String rolename;
    private String description;
    private short listorder;
    private byte disabled;

    @Id
    @Column(name = "roleid", nullable = false, insertable = true, updatable = true)
    public byte getRoleid() {
        return roleid;
    }

    public void setRoleid(byte roleid) {
        this.roleid = roleid;
    }

    @Basic
    @Column(name = "rolename", nullable = false, insertable = true, updatable = true, length = 50)
    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    @Basic
    @Column(name = "description", nullable = false, insertable = true, updatable = true, length = 65535)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "listorder", nullable = false, insertable = true, updatable = true)
    public short getListorder() {
        return listorder;
    }

    public void setListorder(short listorder) {
        this.listorder = listorder;
    }

    @Basic
    @Column(name = "disabled", nullable = false, insertable = true, updatable = true)
    public byte getDisabled() {
        return disabled;
    }

    public void setDisabled(byte disabled) {
        this.disabled = disabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        V9AdminRole that = (V9AdminRole) o;

        if (roleid != that.roleid) return false;
        if (listorder != that.listorder) return false;
        if (disabled != that.disabled) return false;
        if (rolename != null ? !rolename.equals(that.rolename) : that.rolename != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) roleid;
        result = 31 * result + (rolename != null ? rolename.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (int) listorder;
        result = 31 * result + (int) disabled;
        return result;
    }
}
