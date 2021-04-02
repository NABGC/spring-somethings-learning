package com.nabgc.springsecuritytaglibs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    
    @RequestMapping
    public String home() {
        return "home";
    }
}
