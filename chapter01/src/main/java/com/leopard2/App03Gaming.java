package com.leopard2;

import com.leopard2.game.GameRunner;
import com.leopard2.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03Gaming {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}