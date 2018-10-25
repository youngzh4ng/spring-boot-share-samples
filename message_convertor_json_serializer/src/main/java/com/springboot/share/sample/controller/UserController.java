package com.springboot.share.sample.controller;

import com.springboot.share.sample.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/sampleUser")
    public User getSampleUser() {

        User user = new User();
        user.setBirthDay(new Date());
        return user;
    }

}
