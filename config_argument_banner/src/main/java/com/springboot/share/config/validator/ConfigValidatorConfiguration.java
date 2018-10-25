package com.springboot.share.config.validator;

import com.springboot.share.validator.config.SomeObjectValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.Validator;

@Configuration
public class ConfigValidatorConfiguration {

    @Bean
    public Validator getSomeObjectValidator() {
        System.out.println("**********************injected in config validator configuration");
        return new SomeObjectValidator();
    }

}
