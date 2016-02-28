package com.xst.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * 封装了页面展示的类
 * Created by CrazyCodess on 2016/2/28.
 */
public class PageBean<T> {
    private long pageNow;
    private long totalPageCount;
    private boolean hasPre;
    private boolean hasNext;
    //页面展示项的内容,里面放相应的类
    List<T> list=new ArrayList<T>();
    public PageBean(){
        super();
    }
    public PageBean(long pageNow, long totalPageCount, boolean hasPre,
                boolean hasNext, List<T> list) {
        super();
        this.pageNow = pageNow;
        this.totalPageCount = totalPageCount;
        this.hasPre = hasPre;
        this.hasNext = hasNext;
        this.list = list;
    }

    public long getPageNow() {
        return pageNow;
    }

    public void setPageNow(long pageNow) {
        this.pageNow = pageNow;
        if(pageNow==1){
            setHasPre(false);

        }
        else{
            setHasNext(true);
        }
    }

    public long getTotalPageCount() {
        return totalPageCount;
    }

    public void setTotalPageCount(long totalPageCount) {
        this.totalPageCount = totalPageCount;
        if(pageNow<totalPageCount){
            setHasNext(true);
        }
        else{
            setHasNext(false);
        }

    }

    public boolean isHasPre() {
        return hasPre;
    }

    public void setHasPre(boolean hasPre) {
        this.hasPre = hasPre;
    }

    public boolean isHasNext() {
        return hasNext;
    }

    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
    @Override
    public String toString() {
        return "Page [pageNow=" + getPageNow()+ ", totalPageCount="
                + getTotalPageCount() + ", hasPre=" + isHasPre() + ", hasNext="
                + isHasNext() + ", list=" + getList() + "]";
    }
}
