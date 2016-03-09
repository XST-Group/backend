package com.xst.bean;

/**
 * Created by sl on 16-2-27.
 */
public class CateBean {
    private short id;
    private String name;

    //是否存在子结点，1：有
    private boolean isExistChild;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public boolean isExistChild() {
        return isExistChild;
    }

    public void setIsExistChild(boolean isExistChild) {
        this.isExistChild = isExistChild;
    }
}
