package com.niterx.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Homepage {
    @GetMapping("/homepage")
    public String loadWelcomePage(Model model) {
        return "homepage";
    }
}