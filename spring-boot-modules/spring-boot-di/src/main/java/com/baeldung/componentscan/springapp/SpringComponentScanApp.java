package com.nabgc.componentscan.springapp;

import com.nabgc.componentscan.ExampleBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
// @ComponentScan(excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = Rose.class))
// @ComponentScan(basePackages = "com.nabgc.componentscan.springapp")
// @ComponentScan(basePackages = "com.nabgc.componentscan.springapp.animals")
// @ComponentScan (excludeFilters = @ComponentScan.Filter(type=FilterType.REGEX,pattern="com\\.nabgc\\.componentscan\\.springapp\\.flowers\\..*"))
public class SpringComponentScanApp {

    private static ApplicationContext applicationContext;

    @Bean
    public ExampleBean exampleBean() {
        return new ExampleBean();
    }

    public static void main(String[] args) {
        applicationContext = new AnnotationConfigApplicationContext(SpringComponentScanApp.class);

        for (String beanName : applicationContext.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }
    }

}