package com.example.cloudgateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.cloud.gateway.support.ServerWebExchangeUtils;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * @author wuxiaopeng
 * @description: 全局过滤器
 * @date 2020/3/27 10:24
 */
@Configuration
public class AccessGatewayFilter implements GlobalFilter {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        System.out.println("check token and user permission....");
        LinkedHashSet requiredAttribute = exchange.getRequiredAttribute(ServerWebExchangeUtils.GATEWAY_ORIGINAL_REQUEST_URL_ATTR);
        ServerHttpRequest request = exchange.getRequest();
        String requestUri = request.getPath().pathWithinApplication().value();
        if (requiredAttribute != null) {
            Iterator<URI> iterator = requiredAttribute.iterator();
            while (iterator.hasNext()){
                URI next = iterator.next();
            }
        }
        ServerHttpRequest.Builder mutate = request.mutate();
        ServerHttpRequest build = mutate.build();
        return chain.filter(exchange.mutate().request(build).build());
    }
}
