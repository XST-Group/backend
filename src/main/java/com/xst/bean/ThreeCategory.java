package com.xst.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

/**
 * 三级目录
 * Created by sl on 16-2-26.
 */

public class ThreeCategory {

    private ThreeCategoryBase firstCategories;
    private List<ThreeCategory> secondCategories;


    public ThreeCategoryBase getFirstCategories() {
        return firstCategories;
    }

    public void setFirstCategories(ThreeCategoryBase firstCategories) {
        this.firstCategories = firstCategories;
    }

    public List<ThreeCategory> getSecondCategories() {
        return secondCategories;
    }

    public void setSecondCategories(List<ThreeCategory> secondCategories) {
        this.secondCategories = secondCategories;
    }
//    private List<V9Category> thirdCategories;




}
