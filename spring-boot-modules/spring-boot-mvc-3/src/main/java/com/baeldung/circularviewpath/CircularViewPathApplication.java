package com.nabgc.circularviewpath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot launcher for an application
 *
 */
@SpringBootApplication(scanBasePackages = "com.nabgc.controller.circularviewpath")
public class CircularViewPathApplication {

    /**
     * Launches a Spring Boot application
     *
     * @param args null
     */
    public static void main(String[] args) {
        SpringApplication.run(CircularViewPathApplication.class, args);
    }
}
