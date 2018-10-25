package com.springboot.share.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Application {


    public static void main(String[] args) {
        System.out.println("Application Started.test");
        SpringApplication.run(Application.class, args);
    }
}
