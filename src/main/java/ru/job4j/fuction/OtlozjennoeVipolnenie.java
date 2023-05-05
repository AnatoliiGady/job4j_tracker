package ru.job4j.fuction;

import java.util.Arrays;
import java.util.Comparator;

public class OtlozjennoeVipolnenie {
    public static void main(String[] args) {

        String[] names = {
                "Ivan", "Pety"
        };
        Comparator<String> lengthCmp = (left, right) -> {
            System.out.println("execute comparator");
            return Integer.compare(left.length(), right.length());
        };

        Arrays.sort(names, lengthCmp);
    }
}

