package com.springboot.share.template.rest;

import com.springboot.share.template.interception.CommonHttpRequestInterceptor;
import org.springframework.boot.web.client.RestTemplateCustomizer;
import org.springframework.web.client.RestTemplate;

public class HRCProxyCustomizer implements RestTemplateCustomizer {
    @Override
    public void customize(RestTemplate restTemplate) {
        restTemplate.getInterceptors().add(new CommonHttpRequestInterceptor());
    }

}
