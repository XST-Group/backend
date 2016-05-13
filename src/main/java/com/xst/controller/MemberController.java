package com.xst.controller;

import com.xst.bean.StatusMessage;
import com.xst.dao.MemberDao;
import com.xst.dao.MemberVerifyDao;
import com.xst.entity.V9Member;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

/**
 * Created by sl on 16-4-5.
 */
@Controller
@RequestMapping("/member")
public class MemberController {


    @Autowired
    @Qualifier("memberDao")
    private MemberDao memberDao;



    @RequestMapping(value = "/register" , method = RequestMethod.GET)
    public String register(Model model){
        return "member/register";
    }


    @ResponseBody
    @RequestMapping(value = "/register" , method = RequestMethod.POST)
    public StatusMessage register(String email , String  username , String password,String password2,
                                  String codenum , HttpSession session){
        StatusMessage statusMessage=null;
        String message = null;
        codenum=codenum.toLowerCase();
        if(email==""||email==null){
            message = "请输入邮箱！";
            statusMessage = new StatusMessage(0,message);
        }
        else if(memberDao.isEmailExit(email)){
            message = "该邮箱已被注册";
            statusMessage = new StatusMessage(0,message);
        }//else if(!captcha.equals())验证码没搞呢
        else if(username==""||username==null){
            message="请输入用户名！";
            statusMessage = new StatusMessage(0,message);
        }
        else if(memberDao.isUsernameExit(username)){
            message="用户名已存在";
            statusMessage = new StatusMessage(0,message);
        }
        else if(password==""){
            message="请输入密码！";
            statusMessage = new StatusMessage(0,message);
        }else if(password.length()<6||password.length()>16||password.contains(" ")){
            message="输入的密码格式不正确！";
            statusMessage = new StatusMessage(0,message);
        }
        else if(!password.equals(password2)){
            message="两次输入密码不一致！";
            statusMessage = new StatusMessage(0,message);
        }else if(codenum==""||codenum==null){
            message="请输入验证！";
            statusMessage = new StatusMessage(0,message);
        }
        else if(!codenum.trim().equals(((String)session.getAttribute("code")).trim())){
            message="输入的验证不正确！";
            statusMessage = new StatusMessage(0,message);
        }
        else {
            V9Member member = memberDao.addMember(username,email,password);
            message="注册成功,您已登录！";
            //zqh:未完待续
            statusMessage = new StatusMessage(1,message);
            session.setAttribute("memberUser",member);
        }

       return statusMessage;

    }
    @ResponseBody
    @RequestMapping(value = "/login" , method = RequestMethod.POST)
    public StatusMessage login(String username , String password ,
                        HttpSession session/*,RedirectAttributes redirectAttributes*/){
        
        StatusMessage statusMessage;
        String message=null;

        System.out.println("1111111111111111111111   "+username+"  "+password);
        if(username == ""){
            message = "请输入用户名!";
            statusMessage=new StatusMessage(0,message);
        }
        else if(!memberDao.isUsernameExit(username)){
            message="用户名不存在!";
            statusMessage=new StatusMessage(0,message);
        }
        else{
            V9Member member = memberDao.getByName(username);
            if(password == ""){
                message = "请输入密码!";
                statusMessage=new StatusMessage(0,message);
            }else if(!member.getPassword().equals(password)){
                message = "密码错误!";
                statusMessage=new StatusMessage(0,message);

            }else {
                message = "用户登陆成功!";
                statusMessage=new StatusMessage(1,message);
                session.setAttribute("memberUser",member);

            }
        }
        return  statusMessage;
    }


    @RequestMapping(value = "/logout" ,method = RequestMethod.GET)
    public String logout(Model model,HttpSession session){
        session.removeAttribute("memberUser");
        model.addAttribute("Msg","登出成功！");
        return "index";
    }
}
