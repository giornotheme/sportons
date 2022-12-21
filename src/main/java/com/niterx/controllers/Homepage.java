package com.niterx.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Homepage {
    @GetMapping("/login")
    public String loadWelcomePage(Model model, HttpSession session) {
        return "login";
    }
}