package com.xst.controller;

import com.xst.bean.CateBean;
import com.xst.dao.CategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by sl on 16-2-26.
 */

@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryDao categoryDao;


    /**
     * 展示三级目录
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/root", method = RequestMethod.GET)
    public  List<CateBean> showFirstCategory(){

        // 获取一级目录
        List<CateBean> firstCategories = categoryDao.getFirstCategory();
        return firstCategories;
    }

    @ResponseBody
    @RequestMapping(value = "/node/{id}", method = RequestMethod.GET)
    public List<CateBean> find( @PathVariable("id") int id,Model model){

        List<CateBean> cateChildren = categoryDao.getChildren((short)id);

        model.addAttribute("categoryList",cateChildren);
        System.out.println("CategoryController : "+id);

        return cateChildren;
    }





}
