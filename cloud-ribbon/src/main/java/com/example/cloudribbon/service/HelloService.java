package com.example.cloudribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @author:wuxiaopeng
 * @create: 2019-05-13 16:30
 **/
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://cloud-producer/hi?name="+name,String.class);
    }
}
