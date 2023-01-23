package com.example.mvcuppgift.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class InVoiceController {
    @GetMapping("invoicePage")
    public String switchToInvoicePage(){
        System.out.println("Yes");
        return "invoicePage";
    }
    @PostMapping("invoicePage")
    public String switchToEditPage(){
        System.out.println("Edit");
        return "redirect:editPage";
    }
}
