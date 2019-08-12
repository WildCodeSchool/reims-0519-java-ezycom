package com.ezycom.projectEzycom.controllers;

import javax.validation.Valid;

import com.ezycom.projectEzycom.entities.Payplan;
import com.ezycom.projectEzycom.repositories.PayplanRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class PayplanController {

    @Autowired
    private PayplanRepository payplanRepository;

    @GetMapping("/payplans/create")
    public String create(@ModelAttribute Payplan payplan, Model model) {
        model.addAttribute("payplan", payplan);
        return "/payplans/create";
    }

    @PostMapping("/payplans")
    public String validate(@Valid Payplan payplan, BindingResult bindingResult, RedirectAttributes redirectAttrs) {
        if(bindingResult.hasErrors()) {
            for (ObjectError error : bindingResult.getAllErrors()) {

            }
            redirectAttrs.addFlashAttribute("payplan", payplan);
            return "redirect:/payplans/create";
        }
         else {
            payplanRepository.save(payplan);
            return "redirect:/payplans/create";
        }
    }


}