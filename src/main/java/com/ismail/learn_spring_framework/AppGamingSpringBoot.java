package com.ismail.learn_spring_framework;

import com.ismail.learn_spring_framework.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingSpringBoot {
    static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext
                             (AppGamingConfiguration.class)){
            context.getBean(GameRunner.class).run();
        }


    }

}
