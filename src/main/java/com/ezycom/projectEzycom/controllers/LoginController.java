package com.ezycom.projectEzycom.controllers;

import com.ezycom.projectEzycom.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginController {

    @Autowired
    UserRepository userRepo;

    @GetMapping("/login")
    public String login() {
        return "/login";
    }

    @GetMapping("/commercials/create")
    public String payplan() {
        return "/commercials/create";

    }

}
