package ru.job4j.pojo;

import java.util.Date;

public class Library {
    public static void main(String[] args) {
        Book oneBook = new Book("Clean code", 1000);
        Book twoBook = new Book("Язык программирования Java", 1001);
        Book threeBook = new Book("Философия Java", 1002);
        Book fourBook = new Book("Руководство для начинающих", 1003);
        Book[] books = new Book[4];
        books[0] = oneBook;
        books[1] = twoBook;
        books[2] = threeBook;
        books[3] = fourBook;
        for (Book bk : books) {
            System.out.println(bk.getName() + "." + " Количество страниц: " + bk.getCountPage());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        System.out.println();
        for (Book bk : books) {
            System.out.println(bk.getName() + "." + " Количество страниц: " + bk.getCountPage());
        }
        System.out.println();
        for (Book bk : books) {
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getName() + "." + " Количество страниц: " + bk.getCountPage());
            }
        }
    }
}
