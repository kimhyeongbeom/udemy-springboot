package com.leopard2.game;

public class GameRunner {
    //private MarioGame game;
    //private SuperContraGame game;
    private GamingConsole game;

    //public GameRunner(MarioGame game) {
    //public GameRunner(SuperContraGame game) {
    public GameRunner(GamingConsole game) {
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
