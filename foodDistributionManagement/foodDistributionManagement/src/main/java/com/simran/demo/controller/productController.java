package com.simran.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class productController {
    @GetMapping("/products")
    public String productfunc() {
        return "products";
    }
}