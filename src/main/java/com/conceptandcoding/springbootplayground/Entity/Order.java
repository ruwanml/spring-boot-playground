package com.conceptandcoding.springbootplayground.Entity;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order {

    //Invoice invoice = new Invoice();
    @Autowired
    Invoice invoice;

    public Order() {System.out.println("Initializing Order Bean");} // default constructor

    @PostConstruct
    public void initialize() {
        System.out.println("Bean has been initialized and dependencies have been injected");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Bean is about to destroy");
    }
}
