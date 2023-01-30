package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int minln = Math.min(left.length(), right.length());
        for (int i = 0; i < minln; i++) {
            int res = Character.compare(left.charAt(i), right.charAt(i));
            if (res != 0) {
                return res;
            }
        }
        return Integer.compare(left.length(), right.length());
    }
}
