package com.ezycom.projectEzycom.controllers;

import java.util.List;

import com.ezycom.projectEzycom.repositories.ProduitRepository;
import com.ezycom.projectEzycom.entities.Produit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProduitController{

    @GetMapping("/viewSales")
    public String read(Model model){
        model.addAttribute("produit", new com.ezycom.projectEzycom.entities.Produit());
        return "/viewSales";
    }


    @PostMapping("/viewSales")
    public String read() {
        return "/viewSales";
    }
}