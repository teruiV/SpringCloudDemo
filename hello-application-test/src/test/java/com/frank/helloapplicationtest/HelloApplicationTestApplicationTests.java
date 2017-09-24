package com.frank.helloapplicationtest;

import com.frank.helloapplicationtest.controller.HelloController;
import com.frank.helloapplicationtest.service.BlogProperties;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class HelloApplicationTestApplicationTests {
    private static final Logger logger = LoggerFactory.getLogger(HelloApplicationTestApplicationTests.class);

    @Autowired
    private BlogProperties blogProperties;

    private MockMvc mvc;

    @Test
    public void test1(){
        logger.info("name => " + blogProperties.getName());
        logger.info("title => " + blogProperties.getTitle());
        logger.info("desc => " + blogProperties.getDesc());
        logger.info("random => " + blogProperties.getRandomNumber());
        logger.info("special number => " + blogProperties.getSpecialNumber());
    }

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
    }

    @Test
    public void test2() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Hello World!")));
    }


}
