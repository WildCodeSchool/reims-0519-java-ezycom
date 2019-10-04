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

@Controller
public class SaleController {

    @Autowired
    private SaleRepository saleRepo;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/sales")
    public String browse(Model model, @RequestParam(required = false) String month, @RequestParam(required = false) String commercial) {
        if(month != null || commercial != null) {
            List<Commission> commissions = saleRepo.findCommissionsGroupByCommercial(month, commercial);
            model.addAttribute("commissions", commissions);

            List<Sale> sales = saleRepo.findAllSalesByCommercialAndByMonth(month, commercial);
            model.addAttribute("sales", sales);
        } else {
            List<Sale> sales = saleRepo.findAll();
            model.addAttribute("sales", sales);
        }
        List<Sale> listSales = saleRepo.findAll();
        model.addAttribute("listSales", listSales);


        List<User> users = userRepository.findAll();
        model.addAttribute("users", users);

        return "import/sales";
    }

}
