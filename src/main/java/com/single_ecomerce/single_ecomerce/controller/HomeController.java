package com.single_ecomerce.single_ecomerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("dir","home/index");
        model.addAttribute("title","Inicio");
        return  "template";
    }
}
