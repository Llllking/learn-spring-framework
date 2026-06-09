package com.ismail.learn_spring_framework;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
@ComponentScan
public class App02HelloWorldSpring {

    static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext
                             (HelloWorldConfiguration.class)){
            System.out.println(context.getBean("name") + " " + context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("address"));
        }


    }

}
