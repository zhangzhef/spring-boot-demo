package com.example.demo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * 测试 Controller
 * @author zzf
 * @date 18/4/27 14:20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//测试单个 controller
//@SpringBootTest(classes = MockServletContext.class)
//应用启动类
@SpringBootTest(classes = DemoApplication.class)
@WebAppConfiguration
public class Chapter1ApplicationTests {

    @Resource
    private WebApplicationContext context;
    private MockMvc mvc;


    @Before
    public void setUp() throws Exception {
//        mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();

        mvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void getHello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("hello, kitty!")));

        mvc.perform(MockMvcRequestBuilders.get("/index").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
//                .andDo(MockMvcResultHandlers.print())
                .andExpect(content().string(equalTo("Hello World!")));;
    }






}
