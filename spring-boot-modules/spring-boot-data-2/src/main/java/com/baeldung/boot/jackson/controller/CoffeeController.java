package com.nabgc.boot.jackson.controller;

import com.nabgc.boot.jackson.model.Coffee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static com.nabgc.boot.jackson.config.CoffeeConstants.FIXED_DATE;

@RestController
public class CoffeeController {

    @GetMapping("/coffee")
    public Coffee getCoffee(
            @RequestParam(required = false) String brand,
            @RequestParam(required = false) String name) {
        return new Coffee().setBrand(brand)
                .setDate(FIXED_DATE)
                .setName(name);
    }
}
