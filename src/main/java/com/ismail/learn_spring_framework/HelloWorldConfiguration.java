package com.ismail.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age){};

record Address(String city, String firstLine){};


@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "Ismail";
    }

    @Bean
    public int age(){
        return 24;
    }

    @Bean
    public Person person() {
        return new Person("Nada", 9);
    }

    @Bean
    public Address address() {
        return new Address("Casablanca", "Boulevard Mohammed V");
    }
}
