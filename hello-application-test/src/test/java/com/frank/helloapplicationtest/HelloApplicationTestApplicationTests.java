package com.frank.helloapplicationtest;

import com.frank.helloapplicationtest.service.BlogProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloApplicationTestApplicationTests {
    private static final Logger logger = LoggerFactory.getLogger(HelloApplicationTestApplicationTests.class);

    @Autowired
    private BlogProperties blogProperties;

    @Test
    public void test1(){
        logger.info("name => " + blogProperties.getName());
        logger.info("title => " + blogProperties.getTitle());
        logger.info("desc => " + blogProperties.getDesc());
        logger.info("random => " + blogProperties.getRandomNumber());
        logger.info("special number => " + blogProperties.getSpecialNumber());
    }
}
