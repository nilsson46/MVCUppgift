package com.example.mvcuppgift.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class inVoiceController {
    @GetMapping("invoicePage")
    public String switchToInvoicePage(){
        System.out.println("Yes");
        return "invoicePage";
    }
}
