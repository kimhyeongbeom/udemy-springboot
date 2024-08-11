package com.leopard2.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("superContra")
public class SuperContraGame implements GamingConsole {
    public void up() {
        System.out.println("Super Contra up");
    }

    public void down() {
        System.out.println("Super Contra sit down");
    }

    public void left() {
        System.out.println("Super Contra goes back");
    }

    public void right() {
        System.out.println("Super Contra shoots");
    }
}
