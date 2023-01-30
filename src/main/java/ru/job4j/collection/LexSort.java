package ru.job4j.collection;

import java.util.Comparator;
import java.util.List;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        List<String> one = List.of(left.split(". "));
        List<String> two = List.of(right.split(". "));
        return Integer.compare(Integer.parseInt(one.get(0)), Integer.parseInt(two.get(0)));
    }
}
