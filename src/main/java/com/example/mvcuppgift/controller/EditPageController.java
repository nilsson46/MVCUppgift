package com.example.mvcuppgift.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EditPageController {
    @GetMapping("editPage")
    public String switchToEditPage(){
        return "editPage";
    }

    @PostMapping("editPage")

    public String switchToInvoicePage(){
        return "redirect:invoicePage";
    }
}
