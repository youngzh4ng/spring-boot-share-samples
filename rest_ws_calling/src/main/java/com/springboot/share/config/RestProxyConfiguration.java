package com.springboot.share.config;

import com.springboot.share.template.rest.HRCProxyCustomizer;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class RestProxyConfiguration {

    @Bean
    @DependsOn(value = "hrcProxyCustomizer")
    public RestTemplateBuilder restTemplateBuilder() {
        return new RestTemplateBuilder(hrcProxyCustomizer());
    }

    @Bean
    public HRCProxyCustomizer hrcProxyCustomizer() {
        System.out.println("Customising HRCProxyCustomizer");
        return new HRCProxyCustomizer();
    }
}
