package com.ismail.learn_spring_framework;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
@ComponentScan
public class myApp {

    static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext
                             (myApp.class)){
            var businessCalculationService = context.getBean(BusinessCalculationService.class);
            System.out.println(businessCalculationService.findMax());
        }


    }

}
