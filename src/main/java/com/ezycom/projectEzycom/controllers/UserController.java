package com.ezycom.projectEzycom.controllers;

import java.sql.Date;
import java.util.List;
import java.util.Set;

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
        User user,
        RedirectAttributes redirectAttributes
        ) { 
            PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
            user.setPassword(encoder.encode(user.getPassword()));
            userRepository.save(user);
            redirectAttributes.addAttribute("message", "success");
            return "redirect:/users/create";
    }
    
    @GetMapping("/users/associate")
    public String associate(Model model, @RequestParam(required = false) User user) {
        List<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        
        List<Payplan> payplans = payplanRepository.findAll();
        model.addAttribute("payplans", payplans);
        if (user != null)
        {
        Set<PayplanUser> payplanUsers = user.getPayplanUsers();
        model.addAttribute("payplansUsers", payplanUsers);
        }
        return "users/associate";
    }

    @PostMapping("users/associate")
    public String affiliate(User user, Payplan payplan, Date start, Date finish){
        PayplanUser associate = new PayplanUser(user, payplan, start, finish);
        payplanUserRepository.save(associate);
        return "redirect:/users/associate";
    }
}