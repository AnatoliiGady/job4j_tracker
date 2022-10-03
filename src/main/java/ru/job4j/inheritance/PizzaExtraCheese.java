package ru.job4j.inheritance;

public class PizzaExtraCheese extends Pizza {
    private static final String DopOne = " + extra cheese";

    @Override
    public String name() {
        return super.name() + DopOne;
    }
}
