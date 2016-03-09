package com.xst.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Sloriac on 16/2/21.
 */
@Entity
@Table(name = "v9_admin_role", schema = "db_xst")
public class V9AdminRole {
    private byte roleid;
    private String rolename;
    private String description;
    private short listorder;
    private byte disabled;
    private Set<V9Admin> v9Admins = new HashSet<>();

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "v9AdminRole")
    public Set<V9Admin> getV9Admins() {
        return v9Admins;
    }

    public void setV9Admins(Set<V9Admin> v9Admins) {
        this.v9Admins = v9Admins;
    }

    @Id
    @Column(name = "roleid")
    public byte getRoleid() {
        return roleid;
    }

    public void setRoleid(byte roleid) {
        this.roleid = roleid;
    }

    @Basic
    @Column(name = "rolename")
    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
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
    @Column(name = "listorder")
    public short getListorder() {
        return listorder;
    }

    public void setListorder(short listorder) {
        this.listorder = listorder;
    }

    @Basic
    @Column(name = "disabled")
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
