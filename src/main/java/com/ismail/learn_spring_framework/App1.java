package com.ismail.learn_spring_framework;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class myBusinessClass {
    private Dependency1 dependency1;
    private Dependency2 dependency2;

    //with @Autowired or without it dependency 1 and 2 get injected this is why its preferred to use constructor injection
    public myBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    @Override
    public String toString(){
        return dependency1 + " " + dependency2;
    }
}

@Component
class Dependency1 {}

@Component
class Dependency2 {}

@Configuration
@ComponentScan
public class App1 {

    static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext
                             (App1.class)){
            System.out.println(context.getBean(myBusinessClass.class));
        }


    }

}
