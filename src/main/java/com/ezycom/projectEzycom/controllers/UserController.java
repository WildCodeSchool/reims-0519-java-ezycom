package com.ezycom.projectEzycom.controllers;

import java.util.List;

import com.ezycom.projectEzycom.entities.Payplan;
import com.ezycom.projectEzycom.entities.User;
import com.ezycom.projectEzycom.repositories.PayplanRepository;
import com.ezycom.projectEzycom.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller

public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;
   
    private PayplanRepository payplanRepository;

    @GetMapping("/users/create")
    public String create(Model model){
        model.addAttribute("user", new User());
        return "/users/create";
    }
    @PostMapping("/users/create")
    public User create(@RequestParam String email, @RequestParam String password, @RequestParam String role) {
        return userRepository.save(new User(email, passwordEncoder.encode(password), role));
        }
    
   
    
    @GetMapping("/users/associate")
    public String associate(Model model) {
        List<User> users = userRepository.findAll();
        model.addAttribute("users", users);

        
        return "users/associate";

    }

}
