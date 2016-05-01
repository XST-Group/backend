package com.xst.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by sl on 16-5-1.
 */
@Entity
@Table(name = "v9_group", schema = "", catalog = "db_xst_new")
public class V9Group {
    private int id;
    private String type;
    private Integer userNumber;
    private Timestamp createTime;
    private String createUser;
    private String thumb;
    private String description;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "type", nullable = true, insertable = true, updatable = true, length = 255)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "user_number", nullable = true, insertable = true, updatable = true)
    public Integer getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(Integer userNumber) {
        this.userNumber = userNumber;
    }

    @Basic
    @Column(name = "create_time", nullable = true, insertable = true, updatable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "create_user", nullable = true, insertable = true, updatable = true, length = 255)
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Basic
    @Column(name = "thumb", nullable = false, insertable = true, updatable = true, length = 200)
    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    @Basic
    @Column(name = "description", nullable = true, insertable = true, updatable = true, length = 65535)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        V9Group v9Group = (V9Group) o;

        if (id != v9Group.id) return false;
        if (type != null ? !type.equals(v9Group.type) : v9Group.type != null) return false;
        if (userNumber != null ? !userNumber.equals(v9Group.userNumber) : v9Group.userNumber != null) return false;
        if (createTime != null ? !createTime.equals(v9Group.createTime) : v9Group.createTime != null) return false;
        if (createUser != null ? !createUser.equals(v9Group.createUser) : v9Group.createUser != null) return false;
        if (thumb != null ? !thumb.equals(v9Group.thumb) : v9Group.thumb != null) return false;
        if (description != null ? !description.equals(v9Group.description) : v9Group.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (userNumber != null ? userNumber.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (createUser != null ? createUser.hashCode() : 0);
        result = 31 * result + (thumb != null ? thumb.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
