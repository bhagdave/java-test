package com.cc.practicaltest.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

import com.cc.practicaltest.model.Customer;

@Repository
public class CustomerRepository{

    private static final Logger log = LoggerFactory.getLogger(CustomerRepository.class);

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        log.info("set datasource on customer repository");
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public Customer findByCustomerNumber(Long customerNumber){
        String sql = "SELECT * FROM `customers` WHERE `customer_number` = ?";

        return jdbcTemplate.queryForObject(
                sql,
                new Object[]{customerNumber},
                (rs, rowNumber) -> new Customer(
                        rs.getLong("customer_number"),
                        rs.getString("forename"),
                        rs.getString("surname"),
                        rs.getString("telephone_number")
                    )
                );

    }
}
