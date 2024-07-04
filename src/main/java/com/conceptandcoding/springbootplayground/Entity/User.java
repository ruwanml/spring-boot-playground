package com.conceptandcoding.springbootplayground.Entity;

import org.springframework.stereotype.Component;

//@Component
public class User {
    String userName;
    String email;

    public User(String userName, String email) {  // parameterized constructor
        this.userName = userName;
        this.email = email;
        System.out.println("Initializing User Bean");
    }
}
