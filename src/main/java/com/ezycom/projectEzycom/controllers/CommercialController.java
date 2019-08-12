package com.ezycom.projectEzycom.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CommercialController {

    @GetMapping("/commercials/create")
    public String payplan() {
        return "/commercials/create";

    }

}
