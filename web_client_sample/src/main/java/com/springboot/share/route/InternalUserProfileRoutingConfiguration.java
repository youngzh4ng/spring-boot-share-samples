package com.springboot.share.route;

import com.springboot.share.handler.InternalUserProfileHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class InternalUserProfileRoutingConfiguration {

    @Bean
    public RouterFunction<ServerResponse> internalUserProfileRouterFunction(InternalUserProfileHandler handler) {
        System.out.println("**************** Initiating InternalUserProfileRoutingConfiguration");
        return route(GET("/test/internalUserProfileInIr3/{userId}").and(accept(MediaType.TEXT_PLAIN)), handler::getInternalUserProfileFromIRIS3);
    }
}

