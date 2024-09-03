package com.leopard2.funtional;

public class Students {

    public static void main(String[] args) {
        Students students = new Students();
        students.study(new Shoes() {
            @Override
            public void going() {
                System.out.println("Home");
            }
        });
    }

    public void study(Shoes shoes) {
        shoes.going();
    }
}
