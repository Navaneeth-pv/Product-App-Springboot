package com.example.Product_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productController {

    @PostMapping("/")
    public String Homepage(){
        return  "Welcome to Home page";
    }

    @PostMapping("/add")
    public String ProductAdd(){
        return  "Welcome to Product Add";
    }

    @PostMapping("/search")
    public  String ProductSearch(){
        return  "Welcome to Product Search";
    }

    @PostMapping("/edit")
    public String ProductEdit(){
        return "Welcome to Product Edit";

    }

    @GetMapping("/view")
    public String ViewallProducts(){
        return "Welcome to View all Products";
    }

}
