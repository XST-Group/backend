package com.xst.android;

import com.sun.deploy.net.HttpResponse;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * Created by tsj on 16-4-30.
 */
@Controller
@RequestMapping("/android")
public class AndroidTestController {

    @RequestMapping(value="/login",method = RequestMethod.POST)
    public String success(HttpServletResponse response,String name,String psd,RedirectAttributes redirectAttributes){
        System.out.println("username : " + name+"password : "+psd);
        try {
            if(name.equals("123")&&psd.equals("123"))
                response.getWriter().write("true");
            else
                response.getWriter().write("false");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "news/success";
    }
}
