package com.nabgc.autoconfiguration.service;

public class CustomService implements SimpleService {

    @Override
    public String serve() {
        return "Custom Service";
    }

}
