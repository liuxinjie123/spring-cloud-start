package com.eureka.feign.upload.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class FeignUploadServerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(FeignUploadServerApplication.class).web(true).run(args);
    }

}
