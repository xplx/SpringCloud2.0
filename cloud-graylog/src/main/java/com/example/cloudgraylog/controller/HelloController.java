package com.example.cloudgraylog.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuxiaopeng
 * @description:
 * @date 2019/7/3 14:48
 */
@RestController
@Slf4j
public class HelloController {
    @RequestMapping("hello")
    public String hello(){
        for (int i = 0; i < 10000; i++) {
            log.info("info:{}","info 日志打印" + i);
            log.warn("warn:{}","warn 日志打印" + i);
            log.error("error:{}","error 日志打印" + i);
        }
        return "success";
    }
}
