package com.ezycom.projectEzycom.controllers;

import javax.validation.Valid;

import com.ezycom.projectEzycom.entities.PayplanUser;
import com.ezycom.projectEzycom.repositories.PayplanUserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class PayplanUserController {

    @Autowired
    private PayplanUserRepository payplanUserRepository;


    @DeleteMapping("/users/associate/{id}")
    public String deletePayplan(@PathVariable("id") long id, Model model) {
        payplanUserRepository.delete(
            payplanUserRepository.findById(id).get());
        return "redirect:/users/associate";
    }

    @PostMapping("/users/associate")
    public String validate(@Valid PayplanUser payplanUser, BindingResult bindingResult, RedirectAttributes redirectAttrs) {
        if(bindingResult.hasErrors()) {
            for (ObjectError error : bindingResult.getAllErrors()) {
                System.out.println(error.toString());
            }
            redirectAttrs.addFlashAttribute("payplanUser", payplanUser);
            return "redirect:/users/associate";
        }
         else {
            payplanUserRepository.save(payplanUser);
            return "redirect:/users/associate";
        }
    }

    @GetMapping("/users/{id}/edit")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("action", "/payplanUsers/" + id);
        model.addAttribute("method", "put");
        model.addAttribute("payplanUser", payplanUserRepository.findById(id).get());
        return "/users/associate";
    }

    @PutMapping("/users/associate/{id}")

    public String updatePayplan(@PathVariable Long id, PayplanUser payplanUser) {

        PayplanUser payplanUserToUpdate = payplanUserRepository.findById(id).get();

        payplanUserToUpdate.setEndDate(payplanUser.getEndDate());
        payplanUserToUpdate.setStartDate(payplanUser.getEndDate());
        payplanUserRepository.save(payplanUserToUpdate);

        return "redirect:/users/associate";
    }
}