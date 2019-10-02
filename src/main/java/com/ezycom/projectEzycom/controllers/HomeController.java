package com.ezycom.projectEzycom.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ezycom.projectEzycom.entities.User;
import org.springframework.security.core.Authentication;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String forwardByRole(Model model, Authentication authentication, @RequestParam(required = false) String month) {
        User currentUser = (User) authentication.getPrincipal();
        if (currentUser.getRole().equals("Commercial")) {
            return "forward:/commercial";
        } else {
            return "forward:/sales";
        }
    }
}
