package com.leopard2.doublecolon;

import java.util.Date;
import java.util.function.*;

public class MyDateExample {
    public static void main(String[] args) {

        // 클래스 이름 :: Argument없는 생성자(new) 또는 static method
        Supplier<MyDate> myDateSupplier = MyDate::new;

        MyDate mydate = myDateSupplier.get();

        // instance 변수 :: 일반 메서드 
        Function<Date, String> dayPrinter = mydate::getDayName;
        System.out.println("Function dayPrinter : " + dayPrinter.apply(new Date()));

        Consumer<Date> dayPrinterConsumer = mydate::printDayName;
        dayPrinterConsumer.accept(new Date());

        Predicate<Date> weekendPredicate = mydate :: isWeekend;
        System.out.println("weekendPredicate : " + weekendPredicate.test(mydate.getNextDay(new Date())));

        Predicate<Date> sundayPredicate = MyDate :: isSunday;
        System.out.println("sundayPredicate : " + sundayPredicate.test(mydate.getNextDay(new Date())));
    }
    
}
