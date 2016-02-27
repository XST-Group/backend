package com.xst.controller;

import com.xst.bean.V9Category;
import com.xst.dao.CategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
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
     * value = ???
     * @return
     */
    @RequestMapping(value = "/category/show", method = RequestMethod.GET)
    public String showCategory(Model model){

        //第一级目录
        List<V9Category> firstCategories = categoryDao.getCategory("0");

        model.addAttribute("firstCategories",firstCategories);

        for(V9Category firstcate : firstCategories){

            //第二级目录
            List<V9Category> secondCategories = categoryDao.
                    getCategory(firstcate.getCatid().toString());

            model.addAttribute("secondCategories", secondCategories);

            for(V9Category secondcate : secondCategories){
                //第三级目录
                List<V9Category> thirdCategories = categoryDao.
                        getCategory(secondcate.getCatid().toString());

                model.addAttribute("thirdCategories",thirdCategories);
            }
        }

        return "category";
    }

    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public String find(Model model , @RequestParam(required = false) int id){

        List<V9Category> categoryList = new ArrayList<V9Category>();
        V9Category category = categoryDao.getById(id);

        categoryList.add(category);

        while(category.getParentid()!=0){
            int parentid = category.getParentid();
            category = categoryDao.getById(parentid);
            categoryList.add(category);
        }

        model.addAttribute("categoryList",categoryList);

        return "/category/id";
    }




}
