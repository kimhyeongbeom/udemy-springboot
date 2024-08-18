package com.leopard2.funtional;

interface Shoes {
    public void going();
}

class Sneakers implements Shoes {
    @Override
    public void going() {
        System.out.println("School");
    }
}

public class Students {
    public static void main(String[] args) {
        study(new Shoes() {
            @Override
            public void going() {
                System.out.println("Home");
            }
        });
    }

    public static void study(Shoes shoes) {
        shoes.going();
    }
}
