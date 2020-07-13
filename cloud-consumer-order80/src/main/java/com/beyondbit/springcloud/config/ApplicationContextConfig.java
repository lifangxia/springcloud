package com.beyondbit.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author lfx
 * @version 1.0
 * @date 2020/6/30 14:39
 */
@Configuration
public class ApplicationContextConfig
{
    @Bean
//    @LoadBalanced
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }
}
