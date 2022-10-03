package ru.job4j.inheritance;

public class PizzaExtraCheese extends Pizza {
    private static final String DOP_ONE = " + extra cheese";

    @Override
    public String name() {
        return super.name() + DOP_ONE;
    }
}
