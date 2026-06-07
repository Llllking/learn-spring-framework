package com.ismail.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpring {
    static void main(String[] args) {
        //1: Launch a spring context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        //2: Configure the things that we want spring to manage - we do that by creating a configuration class - we do that by creating a class and giving it @Configuration annotation
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("address"));

    }
}
