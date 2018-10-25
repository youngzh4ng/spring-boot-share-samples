package com.test.springboot.route;

import com.test.springboot.handler.UserHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class UserRoutingConfiguration {

    @Bean
    public RouterFunction<ServerResponse> userRouterFunction(UserHandler userHandler) {
        System.out.println("**************** Initiating UserRoutingConfiguration");
        return route(GET("/test/user/{user}").and(accept(MediaType.TEXT_PLAIN)), userHandler::getUser);
    }
}
