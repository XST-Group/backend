package com.xst.interceptor;

import com.xst.util.GlobalVariable;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 注入全局变量
 * Created by sl on 16-3-3.
 *
 */
public class FirstInterceptor extends HandlerInterceptorAdapter {

    GlobalVariable globalVar = new GlobalVariable();

    @Override
    public boolean preHandle(HttpServletRequest request , HttpServletResponse response ,
                             Object object) throws Exception{

        HttpSession session = request.getSession();

        //isHasGlobalVar：用于判断是否已经拦截过
        if(session.getAttribute("isHasGlobalVar") == null){

            System.out.println("进入拦截器...");

            session.setAttribute("isHasGlobalVar",1);
            session.setAttribute("index",globalVar.index);
            System.out.println(session.getAttribute("index"));

        }
        System.out.println("entry.....");


        return  true;

    }

}
