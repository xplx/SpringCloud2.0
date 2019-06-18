package com.example.cloudfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wuxiaopeng
 */
@FeignClient(value = "cloud-producer")
public interface HiService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFrom(@RequestParam(value = "name") String name);
}
