package com.ismail.learn_spring_framework.game;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game = game;
    }
    public void run(){
        System.out.println("Game running: " + game);
        game.up();
        game.down();
        game.right();
        game.left();
    }
}
