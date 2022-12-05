package com.example.Product_app.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productController {

    @PostMapping("/")
    public String Homepage(){
        return  "Welcome to Home page";
    }

}
