package ru.job4j.oop;

import java.security.spec.RSAOtherPrimeInfo;

public class Cat {

    private String food;
    private String name;

    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("GAV");
        gav.show();
        System.out.println("There are black's food");
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("BLACK");
        black.show();

    }
}
