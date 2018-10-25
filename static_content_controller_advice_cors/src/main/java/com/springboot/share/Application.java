package com.springboot.share;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class Application {

    public static void main(String[] args) {
        System.out.println("com.springboot.share.Application Started.");
        SpringApplication.run(Application.class, args);
    }

    @GetMapping("500")
    public void serverError() {
        int a  = 1/0;
        System.out.println(a);
    }
}
