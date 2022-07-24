package com.cc.practicaltest.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

import java.util.List;

import com.cc.practicaltest.model.OrderDetails;

@Repository
public class OrderDetailsRepository{

    private static final Logger log = LoggerFactory.getLogger(OrderDetailsRepository.class);

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        log.info("set datasource");
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<OrderDetails> getOrdersByCustomerNumber(Long customerNumber){
        String sql = "SELECT"+
                        "orders.order_number,"+
                        "sale_price,"+
                        "ov.model_name,"+
                        "ov.trim_name,"+
                        "ov.engine_designation,"+
                        "te.wheel_type,"+
                        "te.infotainment_type,"+
                        "te.headlight_type,"+
                        "te.upholstery_type"+
                    "FROM"+
                        "orders"+
                    "JOIN ordered_vehicles ov on"+
                        "ov.order_number = orders.order_number"+
                    "JOIN models on"+
                        "ov.model_name = models.model_name"+
                    "JOIN engines e2 on"+
                        "e2.engine_designation = ov.engine_designation"+
                    "JOIN trim_equipment te on"+
                        "te.trim_name = ov.trim_name"+
                        "and orders.order_date > te.start_date"+
                        "and (orders.order_date < te.end_date"+
                        "or te.end_date is null)"+
                    "WHERE"+
                        "Customer_number = ?";

        return jdbcTemplate.query(
                sql,
                new Object[]{customerNumber},
                (rs, rowNumber) -> new OrderDetails(
                        rs.getLong("order_number"),
                        rs.getFloat("sale_price"),
                        rs.getString("model_name"),
                        rs.getString("trim_name"),
                        rs.getString("engine_designation"),
                        rs.getString("whel_type"),
                        rs.getString("infotainment_type"),
                        rs.getString("headlight_type"),
                        rs.getString("upholstery_type")
                    )
                );

    }
}
