package com.leopard2.lambda;

public class Cat  implements Printable {
    public String name;
    public int age;

    public Cat() {}

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print(String sss) {
        System.out.println("Meow" + sss);
    }
}
