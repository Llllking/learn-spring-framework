package com.ismail.learn_spring_framework;

import com.ismail.learn_spring_framework.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ismail.learn_spring_framework.game")
public class AppGamingSpringBoot {

    static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext
                             (AppGamingSpringBoot.class)){

            context.getBean(GameRunner.class).run();
        }


    }

}
