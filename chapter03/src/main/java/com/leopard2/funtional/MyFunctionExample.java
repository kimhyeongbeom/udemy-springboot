package com.leopard2.funtional;

import java.util.function.*;

public class MyFunctionExample {
    public static void main(String[] args) {
        Function<Integer, String> numberToText = new Function<Integer, String>() {
            @Override
            public String apply(Integer number) {
                String stringNumber = "";
                
                stringNumber = switch (number) {
                    case 0 -> "zero";
                    case 1 -> "one";
                    case 2 -> "two";
                    case 3 -> "three";
                    default -> "number out of range";
                };
                
                return stringNumber;
            }
        };

        Function<String, Integer> wordCountfFunction = new Function<String,Integer>() {
            @Override
            public Integer apply(String text) {
                if (text == null || text.isEmpty()) {
                    return 0;
                }
                String[] words = text.trim().split(" ");
                return words.length;
            }
        };

        Function<String, String> textLength = new Function<String,String>() {
            @Override
            public String apply(String text) {
                String length = "length : " + text.length() ;
                return length;
            }
        };

        System.out.println(numberToText.compose(wordCountfFunction).apply("java is easy"));
        
        System.out.println(wordCountfFunction.andThen(numberToText).andThen(textLength).apply("Hello world !!"));
    }
}
