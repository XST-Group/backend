package com.xst.test.controller;

import com.xst.entity.V9Category;
import com.xst.entity.V9News;
import com.xst.entity.V9Resources;
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

}
