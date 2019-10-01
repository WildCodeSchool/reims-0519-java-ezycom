package com.ezycom.projectEzycom.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

import com.ezycom.projectEzycom.entities.Commission;
import com.ezycom.projectEzycom.entities.Sale;
import com.ezycom.projectEzycom.entities.User;
import com.ezycom.projectEzycom.repositories.SaleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;

@Controller
public class HomeController {

    @Autowired
    private SaleRepository saleRepo;

    @GetMapping("/home")
    public String forwardByRole(Model model, Authentication authentication) {
        User currentUser = (User) authentication.getPrincipal();
        if (currentUser.getRole().equals("Commercial")) {
            List<Commission> commissions = saleRepo.findCommissionsByCommercialFullName(currentUser.getFullName());
            model.addAttribute("commissions", commissions);
            model.addAttribute("sales", new ArrayList<Sale>());
            return "/commercials/read";
        } else {
            return "forward:/sales";
        }
    }
}
