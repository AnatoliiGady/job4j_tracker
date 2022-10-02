package ru.job4j.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    private final String name = " + extra tomato";

    @Override
    public String name() {
        return super.name() + name;
    }
}
