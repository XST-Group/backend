package com.xst.test.controller;

import com.xst.bean.CateBean;
import com.xst.bean.PageBean;
import com.xst.entity.V9News;
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
import java.util.List;

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
                .andExpect(forwardedUrl("/WEB-INF/views/news/list.jsp"))
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
                .andExpect(forwardedUrl("/WEB-INF/views/news/list.jsp"))
                .andExpect(model().attributeExists("newsPageBean"))
                .andExpect(status().isOk())
                .andDo(print())
                .andReturn();


        PageBean<V9News> pageBean =  (PageBean<V9News>)result.getModelAndView().getModel().get("newsPageBean");

        Assert.assertNotNull(pageBean);



    }
    @Test
    public void testView1()throws Exception{
        MvcResult result = mockMvc
                .perform(get("/news/view"))
                .andExpect(view().name("news/list"))
                .andExpect(forwardedUrl("/WEB-INF/views/news/list.jsp"))
                .andExpect(model().attributeExists("newsPageBean0"))
                .andExpect(status().isOk())
                .andDo(print())
                .andReturn();


        PageBean<V9News> pageBean =  (PageBean<V9News>)result.getModelAndView().getModel().get("newsPageBean0");

        Assert.assertNotNull(pageBean);
    }
}
