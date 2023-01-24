package com.example.mvcuppgift.controller;

import com.example.mvcuppgift.model.Invoice;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.mvcuppgift.service.InvoiceService;


@Controller
public class PaymentController {

    private InvoiceService invoiceService;

    public PaymentController(){invoiceService = new InvoiceService();}

    @GetMapping



    //Create
    @PostMapping
    public String addInvoice(@ModelAttribute Invoice invoice){


    }

}
