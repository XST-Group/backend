package com.xst.test.controller;

import com.xst.bean.CateBean;
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

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Created by sl on 16-2-26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration(value = "src/main/webapp")
@ContextHierarchy({
        @ContextConfiguration(name = "parent", locations = "classpath:conf/spring.xml"),
        @ContextConfiguration(name = "child", locations = "classpath:conf/springmvc.xml")
})

public class CategoryControllerTest {

    @Autowired
    private WebApplicationContext wac;
    private MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void testShowFirstCategory() throws Exception {
        mockMvc
                .perform(get("/category"))
                .andExpect(view().name("category/list"))
                .andExpect(forwardedUrl("/views/category/list.jsp"))
                .andExpect(status().isOk())
                .andDo(print());
    }

    @Test
    public void testFind() throws Exception{

        MvcResult result = mockMvc
                .perform(get("/category/node/{id}",3849))
                .andExpect(forwardedUrl("/views/category/list.jsp"))
                .andExpect(model().attributeExists("categoryList"))
                .andExpect(status().isOk())
                .andDo(print())
                .andReturn();


        List<CateBean> cates =  (List<CateBean>)result.getModelAndView().getModel().get("categoryList");

        Assert.assertNotNull(cates);
//        Assert.assertEquals(cateBean.getName(), "不要让爱你的人失望");

        // TODO 修改后去掉注释
//        Assert.assertEquals(cateBean.getParent().getCatename(), "感恩教育");
    }

}
