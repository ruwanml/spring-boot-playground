package com.conceptandcoding.springbootplayground;

import com.conceptandcoding.springbootplayground.Entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public User createUserBean() {
        return new User("kamal", "kamal@gmail.com");
    }
}
