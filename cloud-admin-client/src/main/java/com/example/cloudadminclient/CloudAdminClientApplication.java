package com.example.cloudadminclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CloudAdminClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudAdminClientApplication.class, args);
    }

}
