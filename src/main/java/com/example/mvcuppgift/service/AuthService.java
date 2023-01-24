package com.example.mvcuppgift.Service;

import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserDetailsService userDetailsService;

    public AuthService(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }
    public boolean authLogin(String username, String password){
        boolean isUsernameAuth = userDetailsService.selectUserByUsername(username).equals(username);
        boolean isPasswordAuth = userDetailsService.selectUserByPassword(password).equals(password);
        return isUsernameAuth && isPasswordAuth;
    }
}
