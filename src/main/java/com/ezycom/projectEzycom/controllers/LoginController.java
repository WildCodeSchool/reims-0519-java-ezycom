package com.ezycom.projectEzycom.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ezycom.projectEzycom.entities.User;

import org.springframework.security.core.Authentication;


@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "/login";
    }
    
    @GetMapping("/loginError")
    public String loginError() {
        return "/loginError";
    }
}
