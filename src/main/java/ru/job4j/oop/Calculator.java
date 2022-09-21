package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation(int v) {
        return sum(v) + multiply(v) + minus(v) + divide(v);

    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        int rst = calculator.multiply(5);
        System.out.println(rst);
        int rstminus = minus(12);
        System.out.println(rstminus);
        int rstdivide = calculator.divide(50);
        System.out.println(rstdivide);
        int rstAll = calculator.sumAllOperation(5);
        System.out.println(rstAll);
    }
}
