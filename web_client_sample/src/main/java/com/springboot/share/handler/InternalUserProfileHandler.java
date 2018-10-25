package com.springboot.share.handler;

import com.springboot.share.domain.InternalUserProfile;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Service
public class InternalUserProfileHandler {

    private final WebClient webClient;


    public InternalUserProfileHandler(WebClient.Builder builder) {
        this.webClient = builder.baseUrl("http://irisbackendqa3.oocl.com/nj_dom_hrc/api/v1/internaluserprofiles").build();
    }

    public Mono<ServerResponse> getInternalUserProfileFromIRIS3(ServerRequest req) {
        String name = req.pathVariable("userId");
        Mono<InternalUserProfile> internalUserProfile = this.webClient.get().uri("/{userId}", name).retrieve().bodyToMono(InternalUserProfile.class);
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(BodyInserters.fromObject(internalUserProfile.block()));
    }

}
