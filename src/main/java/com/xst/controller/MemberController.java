package com.xst.controller;

import com.xst.bean.StatusMessage;
import com.xst.dao.MemberDao;
import com.xst.dao.MemberVerifyDao;
import com.xst.entity.V9Admin;
import com.xst.entity.V9Member;
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
//@RequestMapping("/user")
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

    @RequestMapping(value = "/user/login" , method = RequestMethod.POST)
    public String login(String username , String password , HttpSession session){
        int status = 0;
        String message = "";
        StatusMessage statusMessage = new StatusMessage(status,message);

        if(username == ""){
            message = "请输入用户名";
        }else{
            V9Member member = memberDao.getByName(username);
            if(password == ""){
                message = "请输入密码";
            }else if(!member.getPassword().equals(password)){
                message = "密码错误";
            }else {
                status = 1;
                message = "用户登陆成功";
                session.setAttribute("loginUser",member);
                statusMessage.setStatus(status);
                statusMessage.setMessage(message);
                System.out.println("message1 : "+message);
                // redirectAttributes.addAttribute("loginMsg",message);
                return "redirect:/index";
            }
        }

        System.out.println("message : "+message);
        statusMessage.setStatus(status);
        statusMessage.setMessage(message);
//        redirectAttributes.addAttribute("loginMsg","登录失败");
        return "redirect:/index";
    }















}
