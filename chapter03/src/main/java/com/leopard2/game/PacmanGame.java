package com.leopard2.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole {
    public void up() {
        System.out.println("Pacman jumps");
    }

    public void down() {
        System.out.println("Pacman go into a hole");
    }

    public void left() {
        System.out.println("Pacman goes left");
    }

    public void right() {
        System.out.println("Pacman goes right");
    }
}
