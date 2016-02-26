package com.xst.controller;

import com.xst.bean.ThreeCategory;
import com.xst.bean.ThreeCategoryBase;
import com.xst.bean.V9Category;
import com.xst.dao.CategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by sl on 16-2-26.
 */

@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryDao categoryDao;

    private ThreeCategory threeCategory = new ThreeCategory();
    private ThreeCategoryBase first_second = new ThreeCategoryBase();
//    private List<ThreeCategoryBase> first_secondList;
    private ThreeCategoryBase second_third = new ThreeCategoryBase();


    /**
     * 展示三级目录
     * value = ???
     * @return
     */
    @RequestMapping(value = "/category/", method = RequestMethod.GET)
    public String showThreeCategory(Model model){

        //第一级目录
        List<V9Category> firstCategories = categoryDao.getCategory("0");

        for(V9Category firstcate : firstCategories){

            first_second.setCategory(firstcate);
            //第二级目录
            List<V9Category> secondCategories = categoryDao.
                    getCategory(firstcate.getCatid().toString());

            first_second.setChildren(secondCategories);



            for(V9Category secondcate : secondCategories){
                second_third.setCategory(secondcate);
                //第三级目录
                List<V9Category> thirdCategories = categoryDao.
                        getCategory(secondcate.getCatid().toString());

                second_third.setChildren(thirdCategories);
            }


        }



        return "";
    }

    @RequestMapping(value = "/category/:id", method = RequestMethod.GET)
    public String find(int id){

        return "";
    }




}
