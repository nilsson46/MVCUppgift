package com.example.mvcuppgift.controller;

import com.example.mvcuppgift.Service.InvoiceService;
import com.example.mvcuppgift.model.Invoice;
import com.example.mvcuppgift.repo.InvoiceRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class InVoiceController {

    private InvoiceRepository invoiceRepository;

    @Autowired
    public InVoiceController(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }


    @GetMapping("invoicePage")
    public String switchToInvoicePage(ModelMap model, HttpSession session) {
        String username = (String) session.getAttribute("username");
        model.put("invoices", invoiceRepository.findInvoiceByUsername(username));
        return "invoicePage";
    }

    @PostMapping("invoicePage/update")
    public String switchToEditPage() {
        return "redirect:/editPage";
    }

    @PostMapping("invoicePage/delete")
    public String deleteInvoice(@RequestParam int invoiceId ){
        invoiceRepository.deleteAInvoice(invoiceId);
        return "redirect:/invoicePage";
    }



}
