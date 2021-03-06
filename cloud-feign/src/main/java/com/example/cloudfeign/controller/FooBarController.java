package com.example.cloudfeign.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @author:wuxiaopeng
 * @create: 2019-06-18 17:11
 **/
@RestController
@RefreshScope
public class FooBarController {
    @Value("${foo.bar}")
    String fooBar;

    @GetMapping("/foo")
    public String getFooBar() {
        return fooBar;
    }
}
