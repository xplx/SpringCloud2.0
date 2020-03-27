package com.example.cloudgateway.fallback;

import org.bouncycastle.voms.VOMSAttribute;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuxiaopeng
 * @description:
 * @date 2020/3/27 11:12
 */
@RestController
public class FallBack {
    @GetMapping("fallback")
    public String error(){
        return "fail!";
    }
}
