package com.example.mvcuppgift.repo;

import com.example.mvcuppgift.model.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InvoiceRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    private static String SELECT_QUERY =
            """
                    select * from invoice
                    where id= ?
                    """;

    public void addInvoice(Invoice invoice ) {
        jdbcTemplate.update("INSERT INTO invoice (title, date, description,category, price, username)VALUES(?, now(), ?, ?, ?, ?)",
                invoice.getTitle(), invoice.getDescription(), invoice.getCategory(), invoice.getPrice(), invoice.getUsername());

    }
    public void updateInvoice(int id) {
        jdbcTemplate.update("UPDATE invoice set title = ? WHERE id =?",id);

    }
    public List<Invoice> findInvoiceByUsername(String username) {

        List<Invoice> invoices = jdbcTemplate.query("SELECT * FROM invoice WHERE username =?",
                new BeanPropertyRowMapper<>(Invoice.class), username);

        return invoices;
    }
    public void deleteAInvoice(int id) {
        jdbcTemplate.update("DELETE  FROM invoice WHERE id =?",id);


    }




}
