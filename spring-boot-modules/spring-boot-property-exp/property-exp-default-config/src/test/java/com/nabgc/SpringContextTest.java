package com.nabgc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nabgc.propertyexpansion.SpringBootPropertyExpansionApp;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootPropertyExpansionApp.class)
public class SpringContextTest {

    @Test
    public void whenSpringContextIsBootstrapped_thenNoExceptions() {
    }
}
