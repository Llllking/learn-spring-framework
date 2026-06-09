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
            //System.out.println(context.getBean("name") + " " + context.getBean("age"));
            System.out.println(context.getBean("person"));
            //System.out.println(context.getBean("myAddress"));
            System.out.println(context.getBean(Address.class));
            //System.out.println(context.getBean("person2MethodCall"));
            System.out.println(context.getBean("person3Parameters"));
            var beans = context.getBeanDefinitionNames();
            Arrays.stream(beans).forEach(System.out::println);

        }


    }

}
