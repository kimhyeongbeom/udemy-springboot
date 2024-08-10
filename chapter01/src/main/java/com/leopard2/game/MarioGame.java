package com.leopard2.game;

public class MarioGame implements GamingConsole {
    public void up() {
        System.out.println("Mario jumps");
    }

    public void down() {
        System.out.println("Mario go into a hole");
    }

    public void left() {
        System.out.println("Mario goes left");
    }

    public void right() {
        System.out.println("Mario goes right");
    }
}
