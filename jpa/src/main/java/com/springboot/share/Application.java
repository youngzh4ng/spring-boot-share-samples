package com.springboot.share;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        System.out.println("com.springboot.share.Application Started.");
        SpringApplication.run(Application.class, args);
    }
}
