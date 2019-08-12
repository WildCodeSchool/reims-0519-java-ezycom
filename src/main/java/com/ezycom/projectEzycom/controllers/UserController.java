package com.ezycom.projectEzycom.controllers;

import javax.validation.Valid;

import com.ezycom.projectEzycom.entities.User;
import com.ezycom.projectEzycom.repositories.UserRepository;

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
public class UserController {

    @Autowired
    private UserRepository UserRepository;

    @GetMapping("/commercial/create")
    public String create(@ModelAttribute User user, Model model) {
        model.addAttribute("user", user);
        return "/commercial/create";
    }

    @PostMapping("/commercial")
    public String validate(@Valid User user, BindingResult bindingResult, RedirectAttributes redirectAttrs) {
        if(bindingResult.hasErrors()) {
            for (ObjectError error : bindingResult.getAllErrors()) {

            }
            redirectAttrs.addFlashAttribute("user", user);
            return "redirect:/commercial/create";
        }
         else {
            UserRepository.save(user);
            return "redirect:/commercial/create";
        }
    }    
}