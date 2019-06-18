package com.example.cloudhystrix.controller;

import com.example.cloudhystrix.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @author:wuxiaopeng
 * @create: 2019-05-13 16:42
 **/
@RestController
public class HiController {
    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return helloService.hiService(name);
    }
}
