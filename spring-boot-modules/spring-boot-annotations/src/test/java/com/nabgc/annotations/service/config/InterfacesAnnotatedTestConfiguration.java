package com.nabgc.annotations.service.config;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.ComponentScan;

@TestConfiguration
@ComponentScan("com.nabgc.annotations.service.interfaces")
public class InterfacesAnnotatedTestConfiguration {

}
