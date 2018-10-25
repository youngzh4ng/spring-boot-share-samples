package com.springboot.share.sample.domain;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.springboot.share.sample.serializer.BirthdaySerializer;

import java.util.Date;

public class User {

    private Integer age;

    @JsonSerialize(using = BirthdaySerializer.Serializer.class)
    private Date birthDay;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }
}
