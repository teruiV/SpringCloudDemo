package com.frank.feignconsumer.service;

import com.frank.feignconsumer.domain.User;
import org.springframework.stereotype.Component;

/**
 * Created by jianweilin on 2017/9/28.
 */
@Component
public class HelloServiceFallback implements HelloService{
    @Override
    public String hello() {
        return "error";
    }

    @Override
    public String hello(String name) {
        return "error";
    }

    @Override
    public String hello(String name, Integer age) {
        return "error";
    }

    @Override
    public String hello(User user) {
        return "error";
    }
}
