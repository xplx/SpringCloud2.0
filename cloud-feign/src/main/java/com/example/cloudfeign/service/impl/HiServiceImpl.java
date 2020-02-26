package com.example.cloudfeign.service.impl;

import com.example.cloudfeign.service.HiService;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wuxiaopeng
 * @description:
 * @date 2020/2/25 15:52
 */
@Service
public class HiServiceImpl implements HiService {
    @Override
    public String sayHiFrom(String name) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("调用失败时间：" + sdf.format(new Date()));
        return "调用失败";
    }
}
