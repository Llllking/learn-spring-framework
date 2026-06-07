package com.ismail.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    record Address(String firstLine, String city){};
    //Creating a Bean that will be managed by the spring container
    @Bean
    public String name(){
        return "Ismail";
    }

    @Bean
    public Address address(){
        return new Address("Boulevard Mohammed V", "Casablanca");
    }
}
