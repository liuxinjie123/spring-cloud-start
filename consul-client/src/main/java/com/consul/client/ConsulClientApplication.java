package com.consul.client;

@EnableDiscoveryClient
@SpringBootApplication
public class ConsulClientApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ConsulClientApplication.class)
                .web(true).run(args);
    }
}
