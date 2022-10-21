package ru.job4j.oi;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("Задай один свой закрытый вопрос великому разуму и получи точный ответ!? ");
        String question = input.nextLine();
        int answer = new Random().nextInt(3);
        switch (answer) {
            case 0 -> System.out.println("Да");
            case 1 -> System.out.println("Нет");
            default -> System.out.println("Может быть");
        }
    }
}
