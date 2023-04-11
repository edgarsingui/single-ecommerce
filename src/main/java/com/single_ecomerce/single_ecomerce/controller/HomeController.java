package com.single_ecomerce.single_ecomerce.controller;

import com.single_ecomerce.single_ecomerce.models.Category;
import com.single_ecomerce.single_ecomerce.models.Product;
import com.single_ecomerce.single_ecomerce.repository.CategoryRepository;
import com.single_ecomerce.single_ecomerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("dir","home/index");
        model.addAttribute("title","Inicio");
        Iterable<Product> products = productRepository.findTop5ByFeatured(true);
        Iterable<Category> categories = categoryRepository.findAll();
        model.addAttribute("produtos",products);
        model.addAttribute("categorias",categories);
        return  "template";
    }
}
