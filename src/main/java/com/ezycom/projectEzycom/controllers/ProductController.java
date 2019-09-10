package com.ezycom.projectEzycom.controllers;

import java.util.List;

import com.ezycom.projectEzycom.entities.Product;
import com.ezycom.projectEzycom.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepo;

    @GetMapping("/products")
    public String browse(Model model) {
        List<Product> products = productRepo.findAll();
        model.addAttribute("products", products);
        return "/import/product";
    }
}
