package com.example.mvcuppgift.controller;

import com.example.mvcuppgift.Service.EditInvoiceService;
import com.example.mvcuppgift.model.Invoice;
import com.example.mvcuppgift.repo.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EditPageController {
    private InvoiceRepository invoiceRepository;
    private EditInvoiceService editInvoiceService;

    @Autowired
    public EditPageController(InvoiceRepository invoiceRepository, EditInvoiceService editInvoiceService) {
        this.editInvoiceService = editInvoiceService;
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
    public String updateInvoice(@RequestParam int invoiceId, ModelMap model){
        System.out.println(invoiceId);
        model.put("invoices", invoiceRepository.findInvoiceById(invoiceId));
        return "redirect:/editPage";
    }

    @PostMapping("editPage/Edit")
    public String editInvoice(@RequestParam String title, @RequestParam String description, @RequestParam String category, @RequestParam int price, @RequestParam int id) {
        editInvoiceService.editInvoice(new Invoice(title,description,category,price, invoiceRepository.findInvoiceById(id).toString()));
        return "redirect:invoicePage";
    }
}
