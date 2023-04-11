package com.single_ecomerce.single_ecomerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ProductController {

    @RequestMapping("/products")
    public String all(){
        return  "products/products";
    }
}
