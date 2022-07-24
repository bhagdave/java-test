package com.cc.practicaltest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cc.practicaltest.repository.OrderRepository;
import com.cc.practicaltest.model.Order;

@RestController
public class OrderController {

    private static final Logger log = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private OrderRepository orderRepo;

	@GetMapping("/order/{order_id}")
	public Order getOrder(@RequestBody @PathVariable Long order_id) {
        log.info("In /order/id");
        return orderRepo.findByOrderNumber(order_id);
	}
}
