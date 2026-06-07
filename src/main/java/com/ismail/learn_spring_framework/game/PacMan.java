package com.ismail.learn_spring_framework.game;

public class PacMan implements GamingConsole{
    public void up(){
        System.out.println("Jump");
    }
    public void right(){
        System.out.println("Turn right");
    }
    public void down(){
        System.out.println("Turn left");
    }
    public void left(){
        System.out.println("Shoot");
    }
}
