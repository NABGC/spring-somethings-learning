package com.nabgc.ctx1;

import org.springframework.stereotype.Service;

import com.nabgc.parent.IHomeService;

@Service
public class GreetingService implements IHomeService {

    public String getGreeting() {
        return "Greetings for the day";
    }
}
