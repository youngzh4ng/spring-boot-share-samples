package com.springboot.share.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Component
@ConfigurationProperties(prefix = "validation")
@Validated
public class ValidationConfig {


    @Max(10)
    private int number;

    @NotNull
    private String notNull;

    @Valid
    private NameDesc nameDesc = new NameDesc();

    @Valid
    private SomeObject someObject = new SomeObject();

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNotNull() {
        return notNull;
    }

    public void setNotNull(String notNull) {
        this.notNull = notNull;
    }

    public NameDesc getNameDesc() {
        return nameDesc;
    }

    public void setNameDesc(NameDesc nameDesc) {
        this.nameDesc = nameDesc;
    }

    public SomeObject getSomeObject() {
        return someObject;
    }

    public void setSomeObject(SomeObject someObject) {
        this.someObject = someObject;
    }

    public static class NameDesc {
        @NotEmpty
        private String name;

        private String desc;

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("name: ");
            sb.append(name);
            sb.append("</br>");
            sb.append("desc: ");
            sb.append(desc);
            sb.append("</br>");
            return sb.toString();
        }
    }

    public static class SomeObject {
        private String type;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("type: ");
            sb.append(type);
            sb.append("</br>");
            return sb.toString();
        }
    }

}
