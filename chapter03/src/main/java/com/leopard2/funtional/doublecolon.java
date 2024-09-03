package com.leopard2.funtional;

import java.util.List;

import org.springframework.cglib.core.Predicate;

public class doublecolon {
    public static void printFruits(List<String> fruits) {
        for (String s : fruits) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "orange");

		System.out.println("Using command expression: -------------");
		for (String s : fruits) {
			System.out.println(s);
		}

        System.out.println("Using printFruits method reference: -------------");
        printFruits(fruits);

        Predicate<List> predicate = new Predicate<List>() {
            @Override
            public boolean test(List s) {
                return;
            }
        };

		System.out.println("Using lambda expression: -------------");
		fruits.stream().forEach(s -> System.out.println(s)); 
	
		System.out.println("Using :: Operator : -------------");
		fruits.stream().forEach(System.out::println); 
    }
}
