package com.springboot.share.controller;

import com.springboot.share.domain.User;
import com.springboot.share.jpa.UserRepository;
import com.springboot.share.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserRepository userRepository;

    private UserService userService;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}/{userName}")
    public ResponseEntity<User> getUserByIdAndName(@PathVariable Long id, @PathVariable String userName) {
        User user = userRepository.findByUsernameIgnoreCaseAndId(userName, id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
    @GetMapping("/young")
    public ResponseEntity<User> getYoung() {
        User user = userRepository.findYoung();
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/save/{userId}")
    @Transactional
    public ResponseEntity<Boolean> saveUser(@PathVariable String userId) {
        userService.saveUser(userId);
        return new ResponseEntity<>(true, HttpStatus.OK);
    }


}
