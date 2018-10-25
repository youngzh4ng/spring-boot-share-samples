package com.springboot.share.controller;

import com.springboot.share.service.UserJooqService;
import com.springboot.share.jooq.data.jooq.tables.pojos.TestUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserJooqService userJooqService;

    @Autowired
    public void setUserJooqService(UserJooqService userJooqService) {
        this.userJooqService = userJooqService;
    }

    @GetMapping("/younger/{age}")
    public ResponseEntity<List<TestUser>> getUsersYoungerThan(@PathVariable Long age) {
        List<TestUser> users = userJooqService.userYoungerThan(age);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

}
