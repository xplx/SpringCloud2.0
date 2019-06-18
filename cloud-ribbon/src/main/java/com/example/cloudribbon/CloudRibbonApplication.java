package com.example.cloudribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author wuxiaopeng
 * @date 2019-05-13
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class CloudRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudRibbonApplication.class, args);
    }
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
