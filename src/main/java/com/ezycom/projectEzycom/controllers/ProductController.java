package com.ezycom.projectEzycom.controllers;

import java.util.List;

import com.ezycom.projectEzycom.entities.Product;
import com.ezycom.projectEzycom.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepo;

    @RequestMapping("/products")
    public String browse(Model model) {
        List<Product> products = productRepo.findAll();
        model.addAttribute("products", products);
        return "/import/product";
    }
    // @PostMapping("/product")
    // public String read() {
    //     return "/product";
    // }
}