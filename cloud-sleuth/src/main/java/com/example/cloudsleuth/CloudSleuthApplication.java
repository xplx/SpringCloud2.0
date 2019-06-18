package com.example.cloudsleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * F版本以后不需要自己构建
 */
@EnableEurekaClient
@SpringBootApplication
public class CloudSleuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudSleuthApplication.class, args);
    }

}
