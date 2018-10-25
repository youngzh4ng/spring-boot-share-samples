package com.springboot.share.controller;

import com.springboot.share.domain.InternalUserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("internalUserProfile")
public class InternalUserProfileController {

    private final RestTemplate restTemplate;

    @Autowired
    public InternalUserProfileController(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @GetMapping("/fromIRIS/{userId}")
    public ResponseEntity<InternalUserProfile> findByUserIdFromIRIS(@PathVariable String userId) {
        InternalUserProfile internalUserProfile = this.restTemplate.getForObject("http://irisbackendqa2.oocl.com/nj_dom_hrc/api/v1/internaluserprofiles/{userId}", InternalUserProfile.class, userId);
        return new ResponseEntity<>(internalUserProfile, HttpStatus.OK);
    }

}
