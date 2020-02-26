package com.example.cloudzuul.config;

/**
 * @author wuxiaopeng
 * @description: 获取指定配置
 * @date 2020/2/26 13:54
 */

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@EnableConfigurationProperties(MailConfig.class)
@ConfigurationProperties(prefix = MailConfig.PREFIX, ignoreInvalidFields = true)
public class MailConfig {
    // 这里对应配置文件中的mail前缀
    public static final String PREFIX = "mail";

    private String username;

    private String password;
}
