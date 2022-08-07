package com.project.rest;

import com.project.rest.config.RestTemplateResponseErrorHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan(basePackages = "com.project")
public class RestApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApplication.class, args);
    }

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplateBuilder().errorHandler(new RestTemplateResponseErrorHandler()).build();
    }

}
