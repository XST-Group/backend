package com.xst.test.controller;

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

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Created by CrazyCodess on 2016/4/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration(value = "src/main/webapp")
@ContextHierarchy({
        @ContextConfiguration(name = "parent", locations = "classpath:conf/spring.xml"),
        @ContextConfiguration(name = "child", locations = "classpath:conf/springmvc.xml")
})
public class AddNewsControllerTest {
    @Autowired
    private WebApplicationContext wac;
    private MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }
    @Test
    public void testAddNews()throws Exception{
        MvcResult result = mockMvc
                .perform(get("/addNews/add"))
                //.andExpect(view().name("redirect:/addNews/success"))
               // .andExpect(forwardedUrl("/addNews/success"))
                //.andExpect(flash().attributeExists("addNewsMsg"))
                //.andExpect(status().isOk())
                .andDo(print())
                .andReturn();


//        mockMvc
//                .perform(get("/index"))
//                .andExpect(view().name("index"))
//                .andExpect(forwardedUrl("/views/index.jsp"))
//                .andExpect(status().isOk())
//                .andDo(print());

    }

}
