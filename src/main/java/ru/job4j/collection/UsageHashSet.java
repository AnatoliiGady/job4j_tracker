package ru.job4j.collection;

import java.util.HashSet;

public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Lada");
        names.add("BMW");
        names.add("Lada");
        names.add("Volvo");
        names.add("Toyota");
        names.add("BMW");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
