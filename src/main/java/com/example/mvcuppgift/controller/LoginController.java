package com.example.mvcuppgift.controller;


import com.example.mvcuppgift.Service.AuthService;
import com.example.mvcuppgift.repo.InvoiceRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    private AuthService authService;
    private InvoiceRepository invoiceRepository;


    @Autowired
    public LoginController(AuthService authService, InvoiceRepository invoiceRepository) {
        this.authService = authService;
        this.invoiceRepository = invoiceRepository;
    }

    @GetMapping("login")
    public String switchToHomePage() {
        return "login";
    }


    @PostMapping("login")

    public String switchToInvoicePage(HttpSession session, @RequestParam String username, @RequestParam String password, ModelMap model) {

        if (authService.authLogin(username, password)) {
            session.setAttribute("username", username);
            session.setMaxInactiveInterval(60 * 15);

            return "redirect:invoicePage";

        } else {
            model.put("error", "Incorrect Username or password");
            return "login";
        }
    }
}

