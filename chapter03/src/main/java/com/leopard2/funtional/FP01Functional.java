package com.leopard2.funtional;

import java.util.List;

public class FP01Functional {

    public static void main(String[] args) {
        //printAllNumbersInListFuntional(List.of(12,9,13,4,6,2,4,12,15));
        printEvenNumbersInListStructured(List.of(12,9,13,4,6,2,4,12,15));
    }

    private static void print(int number) {
        System.out.println(number);
    }

    private void print2(int number) {
        System.out.println(number);
    }


    private static void printEvenNumbersInListStructured(List<Integer> numbers) {
        numbers.stream()
               .filter(new java.util.function.Predicate<Integer>() {
                   @Override
                   public boolean test(Integer number) {
                       return number % 2 == 0;
                   }
               })
               .forEach(System.out::println);
    }
    private static void printAllNumbersInListFuntional(List<Integer> numbers) {
        // Convert Stream
        // 각 숫자들에게 필요한 작업지정
        // 메서드 참조 (클래스이름 :: static 메서드명)
        numbers.stream().forEach( FP01Functional::print );

        System.out.println("-------------------1111-----------------");
        
        // 메서드 참조 (Instance이름 :: 메서드명)
        FP01Functional fp01Functional = new FP01Functional();
        numbers.stream().forEach( fp01Functional::print2 );


        System.out.println("-------------------2222-----------------");

        numbers.stream().forEach( num -> print(num));

        
        System.out.println("-------------------3333-----------------");
        numbers.stream().forEach( System.out::println );
        
    }

}
