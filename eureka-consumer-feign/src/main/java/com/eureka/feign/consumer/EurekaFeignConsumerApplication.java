package com.eureka.feign.consumer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaFeignConsumerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaFeignConsumerApplication.class).web(true).run(args);
    }
}
