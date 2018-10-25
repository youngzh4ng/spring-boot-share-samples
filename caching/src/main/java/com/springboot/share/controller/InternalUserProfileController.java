package com.springboot.share.controller;

import com.springboot.share.domain.InternalUserProfile;
import com.springboot.share.jpa.InternalUserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("internalUserProfile")
public class InternalUserProfileController {

    private InternalUserProfileRepository internalUserProfileRepository;

    @Autowired
    public void setInternalUserProfileRepository(InternalUserProfileRepository internalUserProfileRepository) {
        this.internalUserProfileRepository = internalUserProfileRepository;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<InternalUserProfile> findByUserId(@PathVariable String userId) {
        return new ResponseEntity<>(internalUserProfileRepository.findOneByUserIdIgnoreCase(userId), HttpStatus.OK);
    }

}
