package com.ismail.learn_spring_framework;

import com.ismail.learn_spring_framework.game.GameRunner;
import com.ismail.learn_spring_framework.game.MarioGame;
import com.ismail.learn_spring_framework.game.PacMan;

public class AppGamingBasicJava {
    static void main(String[] args) {
        var game = new PacMan();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
