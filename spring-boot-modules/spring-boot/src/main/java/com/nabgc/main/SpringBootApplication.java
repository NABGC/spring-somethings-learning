package com.nabgc.main;

import com.nabgc.boot.controller.servlet.HelloWorldServlet;
import com.nabgc.boot.controller.servlet.SpringHelloWorldServlet;
import com.nabgc.common.error.SpringHelloServletRegistrationBean;
import com.nabgc.common.resources.ExecutorServiceExitCodeGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RestController
@EnableAutoConfiguration
@ComponentScan({ "com.nabgc.common.error", "com.nabgc.common.error.controller", "com.nabgc.common.properties", "com.nabgc.common.resources", "com.nabgc.endpoints", "com.nabgc.service", "com.nabgc.monitor.jmx", "com.nabgc.boot.config" })
public class SpringBootApplication {

    private static ApplicationContext applicationContext;

    @GetMapping("/")
    String home() {
        return "TADA!!! You are in Spring Boot Actuator test application.";
    }

    public static void main(String[] args) {
        applicationContext = SpringApplication.run(SpringBootApplication.class, args);
    }

    @Bean
    public ExecutorService executorService() {
        return Executors.newFixedThreadPool(10);
    }

    @Bean
    public HelloWorldServlet helloWorldServlet() {
        return new HelloWorldServlet();
    }

    @Bean
    public SpringHelloServletRegistrationBean servletRegistrationBean() {
        SpringHelloServletRegistrationBean bean = new SpringHelloServletRegistrationBean(new SpringHelloWorldServlet(), "/springHelloWorld/*");
        bean.setLoadOnStartup(1);
        bean.addInitParameter("message", "SpringHelloWorldServlet special message");
        return bean;
    }

    @Bean
    @Autowired
    public ExecutorServiceExitCodeGenerator executorServiceExitCodeGenerator(ExecutorService executorService) {
        return new ExecutorServiceExitCodeGenerator(executorService);
    }

    public void shutDown(ExecutorServiceExitCodeGenerator executorServiceExitCodeGenerator) {
        SpringApplication.exit(applicationContext, executorServiceExitCodeGenerator);
    }

}
