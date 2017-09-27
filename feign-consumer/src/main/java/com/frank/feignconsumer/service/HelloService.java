package com.frank.feignconsumer.service;

import com.frank.feignconsumer.domain.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jianweilin on 2017/9/27.
 */

@FeignClient("hello-service")
public interface HelloService {

    @RequestMapping("/hello")
    String hello();

    @RequestMapping(value = "/hello1",method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/hello2",method = RequestMethod.GET)
    String hello(@RequestHeader("name") String name,@RequestHeader("age") Integer age);


    @RequestMapping(value = "/hello3",method = RequestMethod.POST)
    String hello(@RequestBody User user);

}
