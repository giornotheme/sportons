package com.niterx.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.niterx.model.User;
import com.niterx.services.UserService;

@Controller
public class UserController {
    
    @Autowired 
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/test")
    public String loadUser(Model model){

        Optional<User> user = userService.getUser(1L);
        System.out.println(user.get().getUsername());
        model.addAttribute("user", user.get().getUsername());
        return "login";
    }
}
