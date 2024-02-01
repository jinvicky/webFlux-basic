package com.example.flux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class WebFluxBasicApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebFluxBasicApplication.class, args);
    }

}
