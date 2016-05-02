package com.xst.android;

import com.sun.deploy.net.HttpResponse;
import com.xst.dao.MemberDao;
import com.xst.entity.V9Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

    @Autowired
    @Qualifier("memberDao")
    private MemberDao memberDao;

    @RequestMapping(value="/login",method = RequestMethod.POST)
    public void login(HttpServletResponse response,String name,String psd,RedirectAttributes redirectAttributes){
        System.out.println("username : " + name+"password : "+psd);
        try {
            V9Member member = memberDao.getByName(name);
            if(member.getPassword().equals(psd))
                response.getWriter().write("true");
            else
                response.getWriter().write("false");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
