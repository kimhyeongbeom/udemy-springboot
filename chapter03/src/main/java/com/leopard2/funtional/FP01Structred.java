package com.leopard2.funtional;

import java.util.List;

public class FP01Structred {

    public static void main(String[] args) {
        System.out.println("---------- all numbers ---------");
        printAllNumbersInListStructured(List.of(12,9,13,4,6,2,4,12,15));

        System.out.println("---------- even numbers ---------");
        printEvenNumbersInListStructured(List.of(12,9,13,4,6,2,4,12,15));
    }

    private static void printEvenNumbersInListStructured(List<Integer> numbers) {
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        // How to loop the numbers?
        for (int number : numbers) {
            System.out.println(number);
        }
    }

}
