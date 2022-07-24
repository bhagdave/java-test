package com.cc.practicaltest.model;

public class Customer {
    private Long customer_number;
    private String forename;
    private String surname;
    private String telephone_number;

    public Customer() {
    }

    public Customer(Long customer_number, String forename, String surname, String telephone_number) {
        this.customer_number = customer_number;
        this.forename = forename;
        this.surname = surname;
        this.telephone_number = telephone_number;
    }

    public Long getCustomerNumber(){
        return customer_number;
    }

    public void setCustomerNumber(Long customer_number){
       this.customer_number = customer_number;
    }

    public String getForename(){
        return forename;
    }

    public void setForename(String forename){
        this.forename = forename;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getTelephoneNumber(){
        return telephone_number;
    }

    public void setTelephoneNumber(String telephone_number){
        this.telephone_number = telephone_number;
    }

}
