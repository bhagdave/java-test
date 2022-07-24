package com.cc.practicaltest.model;

import java.time.LocalDateTime;

public class Order {
    private Long order_number;
    private Long customer_number;
    private Long employee_number;
    private float sale_price;
    private float deposit;
    private LocalDateTime order_date;

    public Order() {
    }

    public Order(Long order_number, Long customer_number, Long employee_number, float sale_price, float deposit, LocalDateTime order_date) {
        this.order_number = order_number;
        this.customer_number = customer_number;
        this.employee_number = employee_number;
        this.sale_price = sale_price;
        this.deposit = deposit;
        this.order_date = order_date;
    }

    public Long getOrderNumber(){
        return order_number;
    }

    public void setOrderNumber(Long order_number){
        this.order_number = order_number;
    }

    public Long getCustomerNumber(){
        return customer_number;
    }

    public void setCustomerNumber(Long customer_number){
       this.customer_number = customer_number;
    }

    public Long getEmployeeNumber(){
        return employee_number;
    }

    public void setEmployeeNumber(Long employee_number){
        this.employee_number = employee_number;
    }

    public float getSalePrice(){
        return sale_price;
    }

    public void setSalePrice(float sale_price){
        this.sale_price = sale_price;
    }

    public float getDeposit(){
        return deposit;
    }

    public void setDeposit(float deposit){
        this.deposit = deposit;
    }

    public LocalDateTime getOrderDate(){
        return order_date;
    }

    public void setOrderDate(LocalDateTime order_date){
        this.order_date = order_date;
    }
       

}
