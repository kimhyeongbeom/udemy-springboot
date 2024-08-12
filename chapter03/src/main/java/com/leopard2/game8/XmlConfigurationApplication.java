package com.leopard2.game8;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.leopard2.game.GameRunner;

public class XmlConfigurationApplication {

    public static void main(String[] args) {
        try(var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println("-----------------------------------------------");
            System.out.println("name = " + context.getBean("name"));      
            System.out.println("age = " + context.getBean("age"));    
            context.getBean(GameRunner.class).run();      
        }
    }
}