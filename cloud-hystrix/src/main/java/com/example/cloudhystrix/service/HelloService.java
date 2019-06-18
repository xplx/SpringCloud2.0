package com.example.cloudhystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @author:wuxiaopeng
 * @create: 2019-06-05 9:39
 **/
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    /**
     * 熔断注解，进入指定方法
     * @param name
     * @return
     */
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://cloud-producer/hi?name="+name,String.class);
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
