package com.example.cloudgateway;


import com.example.cloudgateway.config.HostAddrKeyResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * 路由转发、权限校验、限流控制
 * 协议转换，路由转发
 * 流量聚合，对流量进行监控，日志输出
 * 作为整个系统的前端工程，对流量进行控制，有限流的作用
 * 作为系统的前端边界，外部流量只能通过网关才能访问系统
 * 可以在网关层做权限的判断
 * 可以在网关层做缓存
 * @author wuxiaopeng
 * @date 2019-06-05
 */
@SpringBootApplication
@RestController
public class CloudGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudGatewayApplication.class, args);
    }

    /**
     * 设置限流的策略,使用用户限流
     * @return
     */
    @Bean
    KeyResolver userKeyResolver() {
        return exchange -> Mono.just(exchange.getRequest().getQueryParams().getFirst("user"));
    }

    /**
     * 也可以设置根据请求 IP 地址来限流
     * @return
     */
    @Bean
    public KeyResolver ipKeyResolver() {
        return exchange -> Mono.just(exchange.getRequest().getRemoteAddress().getHostName());
    }

}
