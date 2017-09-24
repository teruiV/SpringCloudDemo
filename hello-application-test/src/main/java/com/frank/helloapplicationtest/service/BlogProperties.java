package com.frank.helloapplicationtest.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 字符串变量、数字变量
 * Created by jianweilin on 2017/9/24.
 */
@Component
@Data
public class BlogProperties {
    @Value("${com.frank.blog.name}")
    private String name;

    @Value("${com.frank.blog.title}")
    private String title;

    @Value("${com.frank.blog.desc}")
    private String desc;

    @Value("${com.frank.blog.number}")
    private Integer randomNumber;

    @Value("${com.frank.blog.special.number}")
    private Integer specialNumber;
}
