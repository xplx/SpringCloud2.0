//package com.example.cloudproducer.consul;
//
//import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
//import org.springframework.cloud.client.discovery.DiscoveryClient;
//import org.springframework.cloud.consul.discovery.ConsulDiscoveryClient;
//import org.springframework.cloud.consul.serviceregistry.ConsulAutoRegistration;
//import org.springframework.cloud.consul.serviceregistry.ConsulServiceRegistry;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Import;
//
//
///**
// * @author wuxiaopeng
// * @description:
// * @date 2020/1/9 14:17
// */
//@Configuration
//@ConditionalOnClass({ConsulDiscoveryClient.class, ConsulAutoRegistration.class, ConsulServiceRegistry.class})
//@Import({ConsulRetryProperties.class})
//public class ConsulRetryAutoConfiguration {
//    public ConsulRetryAutoConfiguration() {
//    }
//
//    @Bean
//    @ConditionalOnMissingBean({ConsulRetryRegistry.class})
//    public ConsulRetryRegistry consulRetryRegistry(ConsulAutoRegistration consulAutoRegistration, ConsulServiceRegistry consulServiceRegistry, DiscoveryClient discoveryClient, ConsulRetryProperties properties) {
//        return new ConsulRetryRegistry(consulAutoRegistration, consulServiceRegistry, discoveryClient, properties);
//    }
//}
