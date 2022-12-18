package com.fhict.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;

@Configuration
public class Config {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/api/v1/tweet/**")
                        .uri("https://kwetter-tweet.agreeablesand-b781a089.westeurope.azurecontainerapps.io/"))

                .route(r -> r.path("/api/v1/profile/**")
                        .uri("http://localhost:8082/"))

                .route(r -> r.path("/api/v1/relation/**")
                        .uri("http://localhost:8083/"))
                .build();
    }
}