package com.xst.test.controller;

import com.xst.entity.V9Category;
import com.xst.entity.V9MemberVerify;
import com.xst.entity.V9News;
import com.xst.entity.V9Resources;
import com.xst.page.Page;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Created by sl on 16-4-4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration(value = "src/main/webapp")
@ContextHierarchy({
        @ContextConfiguration(name = "parent", locations = "classpath:conf/spring.xml"),
        @ContextConfiguration(name = "child", locations = "classpath:conf/springmvc.xml")
})
public class AdminControllerTest {
    @Autowired
    private WebApplicationContext wac;
    private MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }



    @Test
    public void testAddResource() throws Exception {
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.get("/addresource"))
//                .andExpect(view().name("/addresource"))
//                .andExpect(forwardedUrl("resource/view.jsp"))
//                .andExpect(MockMvcResultMatchers.model().attributeExists("firstCategorys"))
                .andExpect(status().isOk())
                .andDo(print())
                .andReturn();

        mockMvc.perform(post("/addresource","1",11,22,33))
                .andExpect(status().isOk())
                .andDo(print());

//        ArrayList<V9News> cates =  (ArrayList<V9News>)result.getModelAndView().getModel().get("newsList");

//        ArrayList<V9Category> categories = (ArrayList<V9Category>) result.getModelAndView().getModel().get("firstCategorys");

      //  Assert.assertNotNull(categories);
    }

    @Test
    public void testLogin() throws Exception {
        mockMvc.perform(post("/admin/login","test","123456"))
                .andExpect(status().isOk())
                .andDo(print());
    }

    @Test
    public void testList()throws Exception{
        MvcResult result = mockMvc
                .perform(get("/admin/verify/list"))
                .andExpect(view().name("admin/verifylist"))
                .andExpect(forwardedUrl("/views/admin/verifylist.jsp"))
                .andExpect(model().attributeExists("page"))
                .andExpect(status().isOk())
                .andDo(print())
                .andReturn();


        mockMvc
                .perform(get("/index"))
                .andExpect(view().name("index"))
                .andExpect(forwardedUrl("/views/index.jsp"))
                .andExpect(status().isOk())
                .andDo(print());


       Page<V9MemberVerify> cates =  (Page<V9MemberVerify>)result.getModelAndView().getModel().get("page");

        Assert.assertNotNull(cates);
    }


    public void testDeleteNews()throws Exception{
        MvcResult result = mockMvc
                .perform(get("/admin/news/delete"))
                .andExpect(view().name("admin/deleteNewsSuccess"))
                .andExpect(forwardedUrl("/views/admin/deleteNewsSuccess.jsp"))
                .andExpect(model().attributeExists("deleteNewsMsg"))
                .andExpect(status().isOk())
                .andDo(print())
                .andReturn();


       /// Page<V9News> newsPage =  (Page<V9News>)result.getModelAndView().getModel().get("newsPageBean");
        String msg=(String)result.getModelAndView().getModel().get("deleteNewsMsg");
        Assert.assertNotNull(msg);



    }

}
