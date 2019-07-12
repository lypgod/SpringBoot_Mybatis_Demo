package cn.com.dxn.demo.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.AutoConfigureMybatis;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import javax.annotation.Resource;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(IndexController.class)
@AutoConfigureMybatis
public class IndexControllerTest {
    @Resource
    private MockMvc mockMvc;

    @Test
    public void indexTest() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/");
        MvcResult result = mockMvc.perform(requestBuilder)
                .andExpect(status().isOk())
                .andExpect(view().name("index"))
                .andExpect(model().attribute("url", "http://www.baidu.com"))
                .andReturn();
    }
}