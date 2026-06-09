package com.ismail.learn_spring_framework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address){};

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
        return new Person("Nada", 9, new Address("TitMellil", "Amal Ouest"));
    }

    @Bean
    public Address address() {
        return new Address("Casablanca", "Boulevard Mohammed V");
    }

    @Bean(name = "address2")
    @Primary
    public Address address2() {
        return new Address("Errachidia", "Targa");
    }

    @Bean
    public Person person2MethodCall(){
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age,@Qualifier("address") Address address){
        return new Person(name, age, address);
    }
}
