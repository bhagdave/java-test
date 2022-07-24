package com.cc.practicaltest.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

import com.cc.practicaltest.model.Order;

@Repository
public class OrderRepository{

    private static final Logger log = LoggerFactory.getLogger(OrderRepository.class);

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        log.info("set datasource");
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public Order findByOrderNumber(Long orderNumber){
        String sql = "SELECT * FROM `orders` WHERE `order_number` = ?";

        return jdbcTemplate.queryForObject(
                sql,
                new Object[]{orderNumber},
                (rs, rowNumber) -> new Order(
                        rs.getLong("order_number"),
                        rs.getLong("customer_number"),
                        rs.getLong("employee_number"),
                        rs.getFloat("sale_price"),
                        rs.getFloat("deposit"),
                        rs.getTimestamp("order_date").toLocalDateTime()
                    )
                );

    }
}
