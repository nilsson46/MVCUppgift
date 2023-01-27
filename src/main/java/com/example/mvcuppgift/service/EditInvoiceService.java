package com.example.mvcuppgift.Service;

import com.example.mvcuppgift.model.Invoice;
import com.example.mvcuppgift.repo.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditInvoiceService {

    private InvoiceRepository invoiceRepository;

    @Autowired
    public EditInvoiceService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public void editInvoice(Invoice invoice) {invoiceRepository.editInvoice(invoice);}
}


