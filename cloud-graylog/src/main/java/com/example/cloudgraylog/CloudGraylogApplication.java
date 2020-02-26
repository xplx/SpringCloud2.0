package com.example.cloudgraylog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * app_name:cloud-graylog AND level_name:ERROR AND "打印87"
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CloudGraylogApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudGraylogApplication.class, args);
    }

}
