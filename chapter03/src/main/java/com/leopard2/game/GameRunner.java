package com.leopard2.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private GamingConsole game;

    public GameRunner(@Qualifier("superContra") GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game: " + game.getClass().getSimpleName());
        game.up();
        game.down();
        game.left();
        game.right();
    }

}
