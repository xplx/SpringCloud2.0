package com.example.cloudproducer.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wuxiaopeng
 * @description:
 * @date 2020/2/26 14:03
 */
@RestController
@Api(tags = "接口管理 HelloController")
public class HelloController {
    @Value("${server.port}")
    String port;

    @ApiOperation(value = "获取信息hi")
    @GetMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) throws InterruptedException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("开始调用时间：" + sdf.format(new Date()));
        Thread.sleep(15000);
        System.out.println("结束调用时间：" + sdf.format(new Date()));
        return "hi " + name + ", i am form port:" + port;
    }

    @ApiOperation(value = "获取信息foo")
    @GetMapping("/foo")
    public String foo(String foo) {
        return "hello "+foo+"! " + "i am form port:"+ port;
    }

    @ApiOperation(value = "获取信息fallback")
    @GetMapping("/fallback")
    public String fallback(String foo) {
        int i = 0;
        System.out.println("熔断" + i++);
        return "fallback "+foo+"! " + "fallback:"+ port;
    }
}
