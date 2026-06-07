package com.ismail.learn_spring_framework;

import com.ismail.learn_spring_framework.game.GameRunner;
import com.ismail.learn_spring_framework.game.GamingConsole;
import com.ismail.learn_spring_framework.game.MarioGame;
import com.ismail.learn_spring_framework.game.PacMan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppGamingConfiguration {
    @Bean
    public GamingConsole game(){
        return new PacMan();
    }
    @Bean(name="gamz")
    public GameRunner gameRunner(GamingConsole game){
        return new GameRunner(game);
    }
}
