package com.nabgc.annotations;

import com.nabgc.annotations.componentscanautoconfigure.teacher.Teacher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.nabgc.annotations.componentscanautoconfigure.healthcare",
        "com.nabgc.annotations.componentscanautoconfigure.employee"},
        basePackageClasses = Teacher.class)
@EnableAutoConfiguration(exclude = {JdbcTemplateAutoConfiguration.class})
//@EnableAutoConfiguration(excludeName = {"org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration"})
public class EmployeeApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmployeeApplication.class, args);
    }
}
