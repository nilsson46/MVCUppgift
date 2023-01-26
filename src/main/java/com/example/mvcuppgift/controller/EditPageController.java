package com.example.mvcuppgift.controller;

import com.example.mvcuppgift.model.Invoice;
import com.example.mvcuppgift.repo.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EditPageController {
    private InvoiceRepository invoiceRepository;

    @Autowired
    public EditPageController(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    @GetMapping("editPage")
    public String switchToEditPage() {
        return "editPage";
    }

    @PostMapping("editPage")

    public String switchToInvoicePage() {
        return "redirect:invoicePage";
    }

    @PostMapping("editPage/update")
    public String updateInvoice(@RequestParam int invoiceId){
        invoiceRepository.updateInvoice(invoiceId);
        return "redirect:/invoicePage";
    }

}
