package com.xst.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by sl on 16-4-5.
 */
public class BaseController {

    /** 基于@ExceptionHandler异常处理 */
    @ExceptionHandler
    public String exp(HttpServletRequest request, Exception ex){

        request.setAttribute("ex", ex);

//        // 根据不同错误转向不同页面
//        if(ex instanceof BusinessException) {
//            return "error-business";
//        }else if(ex instanceof ParameterException) {
//            return "error-parameter";
//        } else {
            return "error";
//        }
    }

}
