package com.trinity.dev.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import org.springframework.context.annotation.ImportResource;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * A Camel Application
 */
@SpringBootApplication
@ImportResource({"classpath:META-INF/camel/*"})
public class UserGateway extends SpringBootServletInitializer {
    /**
     * A main() so we can easily run these routing rules in our IDE
     *
     * @param args
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        SpringApplication.run(UserGateway.class, args);
    }
}
