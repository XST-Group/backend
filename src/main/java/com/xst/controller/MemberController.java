package com.xst.controller;

import com.xst.bean.StatusMessage;
import com.xst.dao.MemberDao;
import com.xst.dao.MemberVerifyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by sl on 16-4-5.
 */
@Controller
public class MemberController {


    @Autowired
    @Qualifier("memberVerifyDao")
    private MemberVerifyDao memberVerifyDao;

    @Autowired
    @Qualifier("memberDao")
    private MemberDao memberDao;



    @RequestMapping(value = "/register" , method = RequestMethod.GET)
    public String register(){
        return "register";
    }



    @ResponseBody
    @RequestMapping(value = "/register" , method = RequestMethod.POST)
    public StatusMessage register(String userName , String email , String password,
                                  String captcha , HttpSession session){

        StatusMessage statusMessage;
        String message = null;

        if(memberVerifyDao.isEmailExit(email)){
            message = "该邮箱已被注册";
            statusMessage = new StatusMessage(0,message);
        }//else if(!captcha.equals())验证码没搞呢
        else {
            //zqh:未完待续
            statusMessage = new StatusMessage(1,message);
        }

        return statusMessage;

    }







}
