package com.xst.test.controller;

import com.xst.entity.V9News;
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
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Created by CrazyCodess on 2016/2/27.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration(value = "src/main/webapp")
@ContextHierarchy({
        @ContextConfiguration(name = "parent", locations = "classpath:conf/spring.xml"),
        @ContextConfiguration(name = "child", locations = "classpath:conf/springmvc.xml")
})
public class NewsControllerTest {
    @Autowired
    private WebApplicationContext wac;
    private MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }
    @Test
    public void testList()throws Exception{
        MvcResult result = mockMvc
                .perform(get("/news/list"))
                .andExpect(view().name("news/list"))
                .andExpect(forwardedUrl("/views/news/list.jsp"))
                .andExpect(model().attributeExists("newsList"))
                .andExpect(status().isOk())
                .andDo(print())
                .andReturn();


        ArrayList<V9News> cates =  (ArrayList<V9News>)result.getModelAndView().getModel().get("newsList");

        Assert.assertNotNull(cates);
    }
    @Test
    public void testView()throws Exception{
        MvcResult result = mockMvc
                .perform(get("/news/view/{pageNow}/{pageSize}",1,10))
                .andExpect(view().name("news/list"))
                .andExpect(forwardedUrl("/views/news/list.jsp"))
                .andExpect(model().attributeExists("newsPageBean"))
                .andExpect(status().isOk())
                .andDo(print())
                .andReturn();


        Page<V9News> newsPage =  (Page<V9News>)result.getModelAndView().getModel().get("newsPageBean");

        Assert.assertNotNull(newsPage);



    }
    @Test
    public void testView1()throws Exception{
        MvcResult result = mockMvc
                .perform(get("/news/view"))
                .andExpect(view().name("news/list"))
                .andExpect(forwardedUrl("/views/news/list.jsp"))
                .andExpect(model().attributeExists("newsPageBean"))
                .andExpect(status().isOk())
                .andDo(print())
                .andReturn();


        Page<V9News> newsPage =  (Page<V9News>)result.getModelAndView().getModel().get("newsPageBean");

        Assert.assertNotNull(newsPage);
    }
    @Test
    public void testView_five()throws Exception{
        MvcResult result = mockMvc
                .perform(get("/news/view/five"))
                .andExpect(view().name("news/list"))
                .andExpect(forwardedUrl("/views/news/list.jsp"))
                .andExpect(model().attributeExists("newsPageBean"))
                .andExpect(status().isOk())
                .andDo(print())
                .andReturn();


        Page<V9News> newsPage =  (Page<V9News>)result.getModelAndView().getModel().get("newsPageBean");

        Assert.assertNotNull(newsPage);
    }
}
