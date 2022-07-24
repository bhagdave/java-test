package com.cc.practicaltest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.cc.practicaltest.repository.CustomerRepository;
import com.cc.practicaltest.model.Customer;
import com.cc.practicaltest.repository.OrderDetailsRepository;
import com.cc.practicaltest.model.OrderDetails;

@RestController
public class CustomerController {

    private static final Logger log = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private CustomerRepository customerRepo;

    @Autowired
    private OrderDetailsRepository orderDetailsRepo;

	@GetMapping("/customer/{customer_id}")
	public Customer getCustomer(@RequestBody @PathVariable Long customer_id) {
        log.info("In /customer/id");
        return customerRepo.findByCustomerNumber(customer_id);
	}

	@GetMapping("/customer/{customer_id}/orders")
	public List<OrderDetails> getCustomerOrders(@RequestBody @PathVariable Long customer_id) {
        log.info("In /customer/id/orders");
        return orderDetailsRepo.getOrdersByCustomerNumber(customer_id);
	}
}
