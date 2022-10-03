package ru.job4j.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    private static final String DOP_TWO = " + extra tomato";

    @Override
    public String name() {
        return super.name() + DOP_TWO;
    }
}
