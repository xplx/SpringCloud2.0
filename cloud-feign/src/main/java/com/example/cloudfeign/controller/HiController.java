package com.example.cloudfeign.controller;

import com.example.cloudfeign.service.HiService;
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
    HiService hiService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return hiService.sayHiFrom( name );
    }
}
