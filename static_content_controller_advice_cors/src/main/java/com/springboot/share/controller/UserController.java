package com.springboot.share.controller;

import com.springboot.share.exception.UserException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping("500")
    public void getServerError() throws UserException {
        throw new UserException("this is a 500 error");
    }

    @GetMapping("user")
    public String getUser() {
        return "Young is 20 now";
    }

}
