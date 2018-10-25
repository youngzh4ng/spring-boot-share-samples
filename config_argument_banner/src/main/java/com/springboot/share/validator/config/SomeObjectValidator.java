package com.springboot.share.validator.config;

import com.springboot.share.config.ValidationConfig;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class SomeObjectValidator implements Validator {
    @Override
    public boolean supports(Class<?> type) {
        return ValidationConfig.SomeObject.class == type;
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationConfig.SomeObject object = (ValidationConfig.SomeObject) o;
        String type = object.getType();
        System.out.println("************type: " + type);
        if("not-a-type".equals(type)) {
            errors.rejectValue(type, "Invalid type");
        }
    }
}
