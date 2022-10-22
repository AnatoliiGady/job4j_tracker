package ru.job4j.oi;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3");
            int matches = Integer.parseInt(input.nextLine());
            if (matches >= 1 && matches <= Math.min(3, count)) {
                count = count - matches;
                turn = !turn;
                System.out.println("Осталось спичек на столе " + count);
            } else {
                System.out.println("Введите корректное число спичек!");
            }
        }
        if (!turn) {
            System.out.println("Выграл первый игрок");
        } else {
            System.out.println("Выграл второй игрок");
        }
    }
}
