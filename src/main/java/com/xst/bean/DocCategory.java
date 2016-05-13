package com.xst.bean;

import java.util.List;

/**
 * 目录类
 * Created by CrazyCodess on 2016/5/13.
 */
public class DocCategory {
    private int id;
    private String name;
    private List<DocCategory> children;

    public DocCategory(int id, List<DocCategory> children, String name) {
        this.id = id;
        this.children = children;
        this.name = name;
    }

    public DocCategory() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DocCategory> getChildren() {
        return children;
    }

    public void setChildren(List<DocCategory> children) {
        this.children = children;
    }
}
