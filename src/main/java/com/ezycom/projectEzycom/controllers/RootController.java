package com.ezycom.projectEzycom.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {

    @GetMapping("/")
    public String mainLogin() {
        return "redirect:/home";
    }
}
