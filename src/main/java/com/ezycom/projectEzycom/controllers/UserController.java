package com.ezycom.projectEzycom.controllers;

import java.sql.Date;
import java.util.List;

import com.ezycom.projectEzycom.entities.Payplan;
import com.ezycom.projectEzycom.entities.PayplanUser;
import com.ezycom.projectEzycom.entities.User;
import com.ezycom.projectEzycom.repositories.PayplanRepository;
import com.ezycom.projectEzycom.repositories.PayplanUserRepository;
import com.ezycom.projectEzycom.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;
   
    @Autowired
    private PayplanRepository payplanRepository;

    @Autowired
    private PayplanUserRepository payplanUserRepository;

    @GetMapping("/users/create")
    public String create(Model model){
        model.addAttribute("user", new User());
        return "/users/create";
    }
    
    @PostMapping("/users/create")
    public String create(
        @RequestParam("email") String email,
        @RequestParam("password") String password,
        @RequestParam("role") String role,
        RedirectAttributes redirectAttributes
        ) { 
            PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
            User user = new User(email, encoder.encode(password), role);
            userRepository.save(user);     
            redirectAttributes.addAttribute("message", "success");
            return "redirect:/users/create";
    }
    
    @GetMapping("/users/associate")
    public String associate(Model model) {

        List<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        
        List<Payplan> payplans = payplanRepository.findAll();
        model.addAttribute("payplans", payplans);

        return "users/associate";
    }

    @PostMapping("users/associate")
    public PayplanUser affiliate(@RequestParam Long emaillist, @RequestParam Long payplanlist, @RequestParam Date start, @RequestParam Date finish){
        PayplanUser associate = new PayplanUser(emaillist, payplanlist, start, finish);
        return payplanUserRepository.save(associate);
    }
}