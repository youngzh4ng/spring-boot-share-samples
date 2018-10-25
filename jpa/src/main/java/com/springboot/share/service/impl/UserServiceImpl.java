package com.springboot.share.service.impl;

import com.springboot.share.domain.User;
import com.springboot.share.jpa.UserRepository;
import com.springboot.share.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void saveUser(String userId) {
        User user = new User();
        user.setAge(18);
        user.setBirthday(new Date());
        user.setEmail(userId + "@oocl.com");
        user.setPhone("867563398854");
        user.setUsername(userId);
        userRepository.save(user);
    }
}
