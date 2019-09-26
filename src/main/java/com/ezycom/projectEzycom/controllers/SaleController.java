package com.ezycom.projectEzycom.controllers;

import java.util.List;

import com.ezycom.projectEzycom.entities.Commission;
import com.ezycom.projectEzycom.entities.Sale;
import com.ezycom.projectEzycom.entities.User;
import com.ezycom.projectEzycom.repositories.SaleRepository;
import com.ezycom.projectEzycom.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SaleController {

    @Autowired
    private SaleRepository saleRepo;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/sales")
    public String browse(Model model) {

        List<Sale> sales = saleRepo.findAll();
        model.addAttribute("sales", sales);

        List<User> users = userRepository.findAll();
        model.addAttribute("users", users);

        List<Commission> commissions = saleRepo.findByCommercial();
        model.addAttribute("commissions", commissions);

        return "import/sales";
    }
}
