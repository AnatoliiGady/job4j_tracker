package ru.job4j.oop;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " летает по воздуху.");
    }

    @Override
    public void driver() {
        System.out.println(getClass().getSimpleName() + " - пилот");

    }
}
