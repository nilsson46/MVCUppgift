package com.example.mvcuppgift.Service;

import com.example.mvcuppgift.repo.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsService {
    private final UserDetailsRepository userDetailsRepository;

    @Autowired
    public UserDetailsService(UserDetailsRepository userDetailsRepository) {
        this.userDetailsRepository = userDetailsRepository;
    }

    public String selectUserByUsername(String username) {
        if (userDetailsRepository.selectPersonUsername(username) != null)
            return userDetailsRepository.selectPersonUsername(username).getUsername();
        return "";
    }

    public String selectUserByPassword(String password) {
        if (userDetailsRepository.selectPersonByPassword(password) != null)
            return userDetailsRepository.selectPersonByPassword(password).getPassword();
        return "";
    }
}
