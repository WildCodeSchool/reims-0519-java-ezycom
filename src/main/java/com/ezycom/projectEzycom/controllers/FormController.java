package com.ezycom.projectEzycom.controllers;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.ezycom.projectEzycom.entities.Toto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class FormController {
    @GetMapping("/form")
    public String showForm(@ModelAttribute Toto toto, Model model) {
        model.addAttribute("toto", toto);
        return "form";
    }

    @PostMapping("/form")
    public String validateForm(@Valid Toto toto, BindingResult bindingResult, RedirectAttributes redirectAttrs) {
        if(bindingResult.hasErrors()) {
            for (ObjectError error : bindingResult.getAllErrors()) {
                System.out.println(error.getDefaultMessage()); 
            }
            redirectAttrs.addFlashAttribute("toto", toto);
            return "redirect:/form";
        }
        else {
            System.out.println(toto.getFirstAttribute());
            System.out.println(toto.getSecondAttribute());
            return "redirect:/form";
        }
    }
}