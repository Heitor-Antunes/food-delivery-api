package com.delivery.food.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodDeliveryController {

    @ResponseBody
    @GetMapping(path = "test")
    public String hello() {
        return "Hello";
    }
}
