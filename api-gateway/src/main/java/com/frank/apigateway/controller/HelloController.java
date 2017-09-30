package com.frank.apigateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jianweilin on 2017/9/30.
 */
@RestController
public class HelloController {

    @RequestMapping("/local/hello")
    public String hello(){
        return "local hello wolrd!";
    }
}
