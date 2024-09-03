package com.leopard2.defaultMethod;

@FunctionalInterface
interface School {
    public default void open() {
        System.out.println("open : 9AM");
    }
    public default void vacation() {
        System.out.println("vacation : 8/1-8/31");
    }
    public default void close();
}

class MySchool implements School {
    @Override
    public void open() {
        System.out.println("open : 10AM");
    }
    @Override
    public void close() {
        System.out.println("close : 4PM");
    }
}

public class DefaultMethodTest {
    public static void main(String[] args) {
        MySchool mySchool = new MySchool();
        mySchool.open();
        mySchool.vacation();
        mySchool.close();
    }
}
