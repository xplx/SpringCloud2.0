package com.example.cloudgateway.fallback;

import org.bouncycastle.voms.VOMSAttribute;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuxiaopeng
 * @description: 全局断路器 :
 * 关于Hystrix断路器，是一种服务容错的保护措施。
 * 断路器本身是一种开关装置，用于在电路上保护线路过载，
 * 当线路中有发生短路状况时，断路器能够及时的切断故障电路，
 * 防止发生过载、起火等情况。
 * @date 2020/3/27 11:12
 */
@RestController
public class FallBack {
    /**
     *
     * @return
     */
    @GetMapping("fallback")
    public String error(){
        return "fail!";
    }
}
