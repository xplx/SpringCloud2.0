package com.example.cloudribbon.controller;

import com.example.cloudribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description:
 * @author:wuxiaopeng
 * @create: 2019-05-13 16:29
 **/
@RestController
public class HelloController {
    @Resource
    HelloService helloService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService( name );
    }
}
