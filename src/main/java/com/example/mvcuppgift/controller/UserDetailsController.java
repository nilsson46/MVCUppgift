package com.example.mvcuppgift.controller;


import com.example.mvcuppgift.model.UserDetails;
import com.example.mvcuppgift.repo.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class UserDetailsController {
    @Autowired
    UserDetailsRepository userDetailsRepository;

    @GetMapping("login")
    public String switchToHomePage(){
        return "login";
    }


    @PostMapping("login")

    public String switchToInvoicePage(@RequestParam String username, @RequestParam String password, ModelMap model){
        //System.out.println(userDetailsRepository.selectPersonByUsername(username));
      //  if(userDetailsRepository.selectPersonByUsername(username).equals(username) && userDetailsRepository.selectPersonByPassword(password).equals(password)){
         //   System.out.println(userDetailsRepository.selectPersonByUsername(username));
        if(username.equals("bob")&&password.equals("123")){
            return "redirect:invoicePage";
        } else {
            System.out.println("FANl");
            model.put("error","Incorrect Username or password");
            return "login";
        }
    }
}
