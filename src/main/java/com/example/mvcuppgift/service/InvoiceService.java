package com.example.mvcuppgift.Service;

import com.example.mvcuppgift.model.Invoice;
import com.example.mvcuppgift.repo.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {
    private final InvoiceRepository invoiceRepository;

    @Autowired
    public InvoiceService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;

    }
   /* public boolean addInvoice(String title, String description, String category, double price){
       if(invoiceRepository.addItem(title,description,category,price)!=null)
           System.out.println("Hell yeah");
       return true;
    } */

    public void addInvoice(Invoice invoice) {
        invoiceRepository.addInvoice(invoice);
    }


}

