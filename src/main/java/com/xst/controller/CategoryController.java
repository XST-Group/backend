package com.xst.controller;

import com.xst.bean.CateBean;
import com.xst.dao.CategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by sl on 16-2-26.
 */

@Controller
@RequestMapping("/")
public class CategoryController {

    @Autowired
    private CategoryDao categoryDao;


    /**
     * 展示三级目录
     * value = ???
     * @return
     */
    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public String showFirstCategory(Model model){

        //一级目录
        List<CateBean> firstCategories = categoryDao.getFirstCategory();

        model.addAttribute("firstCategories",firstCategories);

        return "category/list";
    }

    @RequestMapping(value = "/category/{id}", method = RequestMethod.GET)
    public String find(Model model , @PathVariable("id") int id){

        List<CateBean> cateChildren = categoryDao.getChildren((short)id);

        model.addAttribute("categoryList",cateChildren);

        return "category/list";
    }




}
