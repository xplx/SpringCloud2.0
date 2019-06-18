package com.example.cloudfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author wuxiaopeng
 * @date 2019-05-13
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
public class CloudFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudFeignApplication.class, args);
    }

}
