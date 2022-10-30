package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Student st = freshman;
        /* up casting */
        Object obj = freshman;
    }
}
