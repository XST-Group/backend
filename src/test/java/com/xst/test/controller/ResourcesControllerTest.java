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
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by sl on 16-2-28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration(value = "src/main/webapp")
@ContextHierarchy({
        @ContextConfiguration(name = "parent", locations = "classpath:conf/spring.xml"),
        @ContextConfiguration(name = "child", locations = "classpath:conf/springmvc.xml")
})
public class ResourcesControllerTest {

    @Autowired
    private WebApplicationContext wac;
    private MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }


    @Test
    public void testFind() throws Exception {
        mockMvc.perform(get("/resources/{id}",1))
                .andExpect(status().isOk())
                .andDo(print());
    }


    @Test
    public void testGetResourcesOfLeaf() throws Exception {
        mockMvc
                .perform(get("/resources/{id}", 3728))
                .andExpect(status().isOk())
                .andDo(print());
    }

    @Test
    public void testGetPageResources() throws Exception {
        mockMvc
                .perform(get("/resources/page/{pageNum}/{pageSize}",2,4))
                .andExpect(status().isOk())
                .andDo(print());
    }

    @Test
    public void testGetBrotherResources() throws Exception{
        mockMvc
                .perform(get("/resources/brother/{id}",39024))
                .andExpect(status().isOk())
                .andDo(print());
    }

    @Test
    public void testGetPageResourcesOfLeaf() throws Exception{
        mockMvc
                .perform(get("/resources/pageleaf/{id}/{pageNum}/{pageSize}",3738,1,15))
                .andExpect(status().isOk())
                .andDo(print());
    }


}
