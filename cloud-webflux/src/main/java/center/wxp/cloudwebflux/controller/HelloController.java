package center.wxp.cloudwebflux.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.HandlerFunction;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;

/**
 * @author wuxiaopeng
 * @description:
 * @date 2020/3/27 17:04
 */
@RestController
public class HelloController {
    /**
     * 响应式编程
     * @return
     */
    @GetMapping("/hello")
    public Mono<String> hello() {
        // 【改】使用Mono.just生成响应式数据
        return Mono.just("Welcome to reactive world ~");
    }

    @GetMapping("/hi")
    public String hi() {
        // 【改】使用Mono.just生成响应式数据
        return "Welcome to world ~";
    }
}
