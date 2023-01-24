package com.example.mvcuppgift.service;

import com.example.mvcuppgift.repo.InvoiceRepository;

public class InvoiceService {
    private InvoiceRepository invoiceRepository;

    public InvoiceService () { this.invoiceRepository = new InvoiceRepository();

    }

    public void addInvoice(String title, String description, String category, double price){
        invoiceRepository.addInvoice(title,description,category,price);}
    }

