package com.ezycom.projectEzycom.controllers;

import java.util.List;

import com.ezycom.projectEzycom.entities.User;
import com.ezycom.projectEzycom.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CommercialController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/commercials/create")
    public String commercial(Model model) {
        List<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "commercials/create";

    }

}
