package com.conceptandcoding.springbootplayground.Entity;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class Invoice {
    public Invoice() {System.out.println("Initializing Invoice Bean");}
}
