package com.example.mvcuppgift;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CoworkerController {

    @GetMapping("/home")

    public String switchToHomePage(){

        return "home";
    }

    @PostMapping("/home")

    public String switchToInvoicePage(@RequestParam String username, @RequestParam String password, ModelMap model){
        if("cow1".equalsIgnoreCase(username) && "1234".equals(password)){
            return "redirect:/invoicePage";
        } else {
            model.put("error","Incorrect Username or password");
            return "home";
        }
    }
}
