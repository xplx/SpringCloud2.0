package com.example.cloudproducer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuxiaopeng
 * @date 2019-05-13
 */
@EnableEurekaClient
@RestController
@SpringBootApplication
public class CloudProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudProducerApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam (value = "name", defaultValue = "forezp") String name){
        return "hi " + name + ", i am form port:" + port;
    }

    @RequestMapping("/foo")
    public String foo(String foo) {
        return "hello "+foo+"! " + "i am form port:"+ port;
    }

    @RequestMapping("/fallback")
    public String fallback(String foo) {
        int i = 0;
        System.out.println("熔断" + i++);
        return "fallback "+foo+"! " + "fallback:"+ port;
    }
}
