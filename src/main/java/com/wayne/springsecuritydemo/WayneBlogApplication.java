package com.wayne.springsecuritydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class WayneBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(WayneBlogApplication.class, args);
    }

}
