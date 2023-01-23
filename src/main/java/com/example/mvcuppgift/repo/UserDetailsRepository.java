package com.example.mvcuppgift.repo;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDetailsRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public UserDetailsRepository selectPersonByUsername(String username) {
        try {
            return jdbcTemplate.queryForObject("SELECT username FROM users WHERE username=?",
                    new BeanPropertyRowMapper<>(UserDetailsRepository.class), username);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    public UserDetailsRepository selectPersonByPassword(String password) {
        try {
            return jdbcTemplate.queryForObject("SELECT password FROM users WHERE password=?",
                    new BeanPropertyRowMapper<>(UserDetailsRepository.class), password);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }

    }
}
