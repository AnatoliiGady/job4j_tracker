package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public boolean isEquals(String originText, String duplicatText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicatText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String origins : origin) {
            check.add(origins);
        }
        for (String dupl : text) {
            if (!check.contains(dupl)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
