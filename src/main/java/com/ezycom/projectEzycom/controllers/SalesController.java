package com.ezycom.projectEzycom.controllers;

import java.util.List;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ezycom.projectEzycom.entities.Commission;
import com.ezycom.projectEzycom.entities.Sales;
import com.ezycom.projectEzycom.repositories.SalesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SalesController {

    @Autowired
    private SalesRepository salesRepo;
    
    @GetMapping("/sales")
    public String browse(Model model) {

        List<Sales> sales = salesRepo.findAll();
        model.addAttribute("sales", sales);
    
        List<Commission> commissions = salesRepo.findByCommercial();
        model.addAttribute("commissions", commissions);

        return "import/sales";
    }
}
