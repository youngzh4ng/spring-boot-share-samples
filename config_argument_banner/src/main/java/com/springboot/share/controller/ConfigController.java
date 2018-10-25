package com.springboot.share.controller;

import com.springboot.share.config.AppConfig;
import com.springboot.share.config.MergeConfig;
import com.springboot.share.config.MiscConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    private AppConfig appConfig;

    private MergeConfig mergeConfig;

    private MiscConfig miscConfig;

    @Autowired
    public void setAppConfig(AppConfig appConfig) {
        this.appConfig = appConfig;
    }

    @Autowired
    public void setMergeConfig(MergeConfig mergeConfig) {
        this.mergeConfig = mergeConfig;
    }

    @Autowired
    public void setMiscConfig(MiscConfig miscConfig) {
        this.miscConfig = miscConfig;
    }

    @RequestMapping("/")
    String home() {
        return "Hello World!fdsafdsa";
    }

    @RequestMapping("/appConfig")
    public ResponseEntity<String> getAppConfig() {
        return new ResponseEntity<>(appConfig.toString(), HttpStatus.OK);
    }

    @RequestMapping("/mergeConfig")
    public ResponseEntity<String> getMergeConfig() {
        return new ResponseEntity<>(mergeConfig.toString(), HttpStatus.OK);
    }

    @RequestMapping("/miscConfig")
    public ResponseEntity<String> getMiscConfig() {
        return new ResponseEntity<>(miscConfig.toString(), HttpStatus.OK);
    }

}
