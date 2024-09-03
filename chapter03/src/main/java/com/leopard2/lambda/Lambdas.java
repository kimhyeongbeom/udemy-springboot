package com.leopard2.lambda;

public class Lambdas {
    public static void main(String[] args) {
        //Cat myCat = new Cat();
        //myCat.print();
        //printThing(myCat);
        Printable lambdaPrintable = (s) -> {
            System.out.println("Meow " + s);
            return "Meow";
        };
        printThing(lambdaPrintable);
    }

    static void printThing(Printable thing) {
        thing.print("!");
    }
}
