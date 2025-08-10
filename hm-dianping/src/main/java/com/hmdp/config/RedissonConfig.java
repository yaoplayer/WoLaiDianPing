package com.hmdp.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ProjectName: hm-dianping
 * Package: com.hmdp.config
 * ClassName: RedissonConfig
 *
 * @Author 姚昭丞
 * @Create 2025/8/7 16:54
 * @Version 1.0
 * Description:
 */
@Configuration
public class RedissonConfig {

    @Bean
    public RedissonClient redissonClient() {

        Config config = new Config();

        config.useSingleServer()
                .setAddress("redis://192.168.116.129:6379")
                .setPassword("123456789");


        return Redisson.create(config);
    }
}
