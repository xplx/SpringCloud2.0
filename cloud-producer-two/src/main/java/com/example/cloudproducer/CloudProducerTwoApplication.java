package com.example.cloudproducer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuxiaopeng
 * @date 2019-05-13
 */
@EnableDiscoveryClient
@RestController
@SpringBootApplication
public class CloudProducerTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudProducerTwoApplication.class, args);
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
