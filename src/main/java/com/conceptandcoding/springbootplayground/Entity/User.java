package com.conceptandcoding.springbootplayground.Entity;

import org.springframework.stereotype.Component;

@Component
public class User {

    Order order;

    public User(Order order) {
        this.order = order;
        System.out.println("User initialized");
    }
}
