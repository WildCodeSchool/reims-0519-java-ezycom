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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.security.core.Authentication;

@Controller
public class CommercialController {

    @Autowired
    private SaleRepository saleRepo;

    @GetMapping("/commercial")
    public String browse(Model model, @RequestParam(required = false) String month, Authentication authentication) {
        User currentUser = (User) authentication.getPrincipal();
            List<Sale> listSales = saleRepo.findAll();
            model.addAttribute("listSales", listSales);
            List<Commission> commissions = saleRepo.findCommissionsGroupByCommercial(month, currentUser.getFullName());
            List<Sale> sales = saleRepo.findAllSalesByCommercial(currentUser.getFullName());
            model.addAttribute("commissions", commissions);
            model.addAttribute("sales", sales);
            return "/commercials/read"; 
    } 
}
