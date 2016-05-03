package com.xst.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by sl on 16-5-3.
 */
@Controller
@RequestMapping("/library")
public class LibraryController {

    @RequestMapping(value = "/list" , method = RequestMethod.GET)
    public String list(){
        return "/library/list";
    }


}
