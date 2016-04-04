package com.xst.controller;

import com.xst.bean.CateBean;
import com.xst.dao.CategoryDao;
import com.xst.dao.ResourcesDao;
import com.xst.entity.V9Resources;
import com.xst.util.MultipartFileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by sl on 16-4-4.
 */
@Controller
//@RequestMapping("/add")
public class AddResourcesController {

    @Autowired
    @Qualifier("categoryDao")
    private CategoryDao categoryDao;

    @Autowired
    @Qualifier("resourcesDao")
    private ResourcesDao resourcesDao;


    /**
     * 添加课程，GET
     * @param model
     * @return 一级目录
     */
    @ResponseBody
    @RequestMapping(value = "/addresource" , method = RequestMethod.GET)
    public String addResource(Model model){

        List<CateBean> fisrtCategorys = categoryDao.getFirstCategory();

        model.addAttribute("firstCategorys",fisrtCategorys);

        return  "/resource/view";
    }


    @ResponseBody
    @RequestMapping(value = "/addresource" , method = RequestMethod.POST)
    public String addResource(String title , int category1id , int category2id , int category3id ,
                              MultipartFile video , RedirectAttributes redirectAttributes ,
                              HttpSession session){

        if(!video.isEmpty()){

            String filePath = session.getAttribute("upFilePath").toString();
            String videoUrl = MultipartFileUtils.saveFile(video,filePath);

            resourcesDao.addResource(title,category1id,category2id,category3id,videoUrl);
        }

        redirectAttributes.addAttribute("resourceMsg","添加课程成功");
        return "redirect:/resource/view";

    }


}
