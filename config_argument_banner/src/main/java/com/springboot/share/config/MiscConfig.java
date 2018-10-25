package com.springboot.share.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "misc")
public class MiscConfig {

    private int randomNumber;
    private String placeholder;
    @Value("${misc.opt}")
    private String opt;

    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public String getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    public String getOpt() {
        return opt;
    }

    public void setOpt(String opt) {
        this.opt = opt;
    }

    public String toString() {
        return "randomNumber: " + randomNumber + "<br/>placeholder: " + placeholder+ "<br/>opt: " + opt;
    }

}
