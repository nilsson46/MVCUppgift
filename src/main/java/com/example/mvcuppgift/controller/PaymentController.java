package com.example.mvcuppgift.controller;

import com.example.mvcuppgift.Service.InvoiceService;
import com.example.mvcuppgift.model.Invoice;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PaymentController {

    private InvoiceService invoiceService;
    @Autowired
    public PaymentController(InvoiceService invoiceService){
    this.invoiceService = invoiceService;}


    @GetMapping("payment")
    public String switchToHomePage(){
        return "payment";
    }


    //Create
    @PostMapping("payment")
    public String addInvoice(@RequestParam String title, @RequestParam String description, @RequestParam String category, @RequestParam int price, HttpSession session) {

        invoiceService.addInvoice(new Invoice(title,description,category,price, (String) session.getAttribute("username")));
        return "redirect:invoicePage";


    }

}
