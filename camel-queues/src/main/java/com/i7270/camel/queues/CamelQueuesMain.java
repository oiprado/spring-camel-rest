/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.i7270.camel.queues;

//import org.apache.camel.spring.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 *
 * @author oiprado
 */
@SpringBootApplication
@ImportResource({"classpath:META-INF/camel/*"})
public class CamelQueuesMain {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(CamelQueuesMain.class, args);
//        Main.main(args);
    }
}
