package com.ezycom.projectEzycom.controllers;

import javax.validation.Valid;

import com.ezycom.projectEzycom.entities.Payplan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class PayplanController {

    @GetMapping("/createpayplan")
    public String showcreatepayplan(@ModelAttribute Payplan payplan, Model model) {
        model.addAttribute("payplan", payplan);
        return "createpayplan";
    }

    @PostMapping("/createpayplan")
    public String validatecreatepayplan(@Valid Payplan payplan, BindingResult bindingResult, RedirectAttributes redirectAttrs) {
        if(bindingResult.hasErrors()) {
            for (ObjectError error : bindingResult.getAllErrors()) {

            }
            redirectAttrs.addFlashAttribute("payplan", payplan);
            return "redirect:/createpayplan";
        }
        else {
          
            return "redirect:/createpayplan";
        }
    }

}