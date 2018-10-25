package com.springboot.share;

import com.springboot.share.validator.config.SomeObjectValidator;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.Validator;

@SpringBootApplication
public class Application {

    @Bean
    public static Validator configurationPropertiesValidator(ApplicationArguments args) {
        System.out.println("**********************injected in application");
        System.out.println("option misc.opt: " + args.getOptionValues("misc.opt"));
        System.out.println("non-option arguments " + args.getNonOptionArgs().toString());
        return new SomeObjectValidator();
    }


    public static void main(String[] args) {
        System.out.println("com.springboot.share.Application Started.");
        SpringApplication springApplication = new SpringApplication(Application.class);
        springApplication.setAddCommandLineProperties(false);
//        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);
    }
}
