package com.leopard2;

import com.leopard2.game.GameRunner;
import com.leopard2.game.PacmanGame;

public class App01Gaming {
    public static void main(String[] args) {
        //var game = new MarioGame();
        //var game = new SuperContraGame();
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}