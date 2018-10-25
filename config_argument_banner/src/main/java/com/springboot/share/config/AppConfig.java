package com.springboot.share.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app")
public class AppConfig {

    private String applicationName;
    private String kebabCase;
    private String camelCase;
    private String underscoreNotation;
    private String upperCaseFormat;

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getKebabCase() {
        return kebabCase;
    }

    public void setKebabCase(String kebabCase) {
        this.kebabCase = kebabCase;
    }

    public String getCamelCase() {
        return camelCase;
    }

    public void setCamelCase(String camelCase) {
        this.camelCase = camelCase;
    }

    public String getUnderscoreNotation() {
        return underscoreNotation;
    }

    public void setUnderscoreNotation(String underscoreNotation) {
        this.underscoreNotation = underscoreNotation;
    }

    public String getUpperCaseFormat() {
        return upperCaseFormat;
    }

    public void setUpperCaseFormat(String upperCaseFormat) {
        this.upperCaseFormat = upperCaseFormat;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("applicationName: ");
        sb.append(applicationName);
        sb.append("</br> ");
        sb.append("kebabCase: ");
        sb.append(kebabCase);
        sb.append("</br> ");
        sb.append("camelCase: ");
        sb.append(camelCase);
        sb.append("</br> ");
        sb.append("underscoreNotation: ");
        sb.append(underscoreNotation);
        sb.append("</br> ");
        sb.append("upperCaseFormat: ");
        sb.append(upperCaseFormat);
        return sb.toString();
    }
}
