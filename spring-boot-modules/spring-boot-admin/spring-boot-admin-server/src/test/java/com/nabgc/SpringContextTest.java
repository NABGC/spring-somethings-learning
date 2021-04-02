package com.nabgc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nabgc.springbootadminserver.SpringBootAdminServerApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootAdminServerApplication.class)
public class SpringContextTest {

    @Test
    public void whenSpringContextIsBootstrapped_thenNoExceptions() {
    }
}