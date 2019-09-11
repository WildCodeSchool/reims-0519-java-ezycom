package com.ezycom.projectEzycom.controllers;

import java.util.List;

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
        return "import/sales";
    }
}
