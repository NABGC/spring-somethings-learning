package com.nabgc.rss;

import javax.annotation.security.RolesAllowed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.nabgc.rss")
public class RssApp {

    @RolesAllowed("*")
    public static void main(String[] args) {
        SpringApplication.run(RssApp.class, args);
    }

}
