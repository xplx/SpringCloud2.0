package com.example.cloudadminclient.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @author:wuxiaopeng
 * @create: 2019-06-15 11:32
 **/
@RestController
@RequestMapping("/api")
@Slf4j
public class Hello {
    @RequestMapping("/test")
    public String test() {
        log.info("访问日志：{}");
        return "This is a test result.";
    }
}
