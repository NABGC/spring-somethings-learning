package com.nabgc.testloglevel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.nabgc.testloglevel", "com.nabgc.component"})
public class TestLogLevelApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestLogLevelApplication.class, args);
    }

}
