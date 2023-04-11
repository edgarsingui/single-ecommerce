package com.single_ecomerce.single_ecomerce.controller;

import com.single_ecomerce.single_ecomerce.models.Product;
import com.single_ecomerce.single_ecomerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;
    @RequestMapping("/products")
    public String all(Model model){
        model.addAttribute("dir","products/products");
        model.addAttribute("title","Produtos");
        Iterable<Product> products = productRepository.findAll();
        model.addAttribute("produtos",products);
        return  "template";
    }
}
