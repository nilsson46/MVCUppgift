package com.example.mvcuppgift.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("login")
    public String switchToHomePage(){
        return "login";
    }

    @PostMapping("login")
    public String switchToInvoicePage(@RequestParam String username, @RequestParam String password, ModelMap model){
        if("bob".equalsIgnoreCase(username) && "1234".equals(password)){
            return "redirect:invoicePage";
        } else {
            model.put("error","Incorrect Username or password");
            return "login";
        }
    }
}
