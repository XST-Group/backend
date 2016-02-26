package com.xst.bean;

import javax.persistence.Entity;
import java.util.List;

/**
 * Created by sl on 16-2-26.
 */

public class ThreeCategoryBase {

    private V9Category category;

    private List<V9Category> children;




    public V9Category getCategory() {
        return category;
    }

    public void setCategory(V9Category category) {
        this.category = category;
    }

    public List<V9Category> getChildren() {
        return children;
    }

    public void setChildren(List<V9Category> children) {
        this.children = children;
    }
}
