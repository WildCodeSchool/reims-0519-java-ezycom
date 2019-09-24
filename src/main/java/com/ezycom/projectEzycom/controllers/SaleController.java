package com.ezycom.projectEzycom.controllers;

import java.util.List;

import com.ezycom.projectEzycom.entities.Sale;
import com.ezycom.projectEzycom.repositories.SaleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SaleController {

    @Autowired
    private SaleRepository saleRepo;

    @GetMapping("/sales")
    public String browse(Model model) {
        List<Sale> sales = saleRepo.findAll();
        model.addAttribute("sales", sales);
        return "import/sales";
    }
}
