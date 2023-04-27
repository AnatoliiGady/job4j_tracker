package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class FI {
    public static void main(String[] args) {
        Attachment[] atts = {
                new Attachment("image", 20),
                new Attachment("imagee", 120),
                new Attachment("imageee", 23),
        };
        Comparator<Attachment> comparator = (left, right) -> Integer.compare(left.getSize(), right.getSize());
        Comparator<String> cmpSize = (left, right) -> Integer.compare(left.length(), right.length());
        Comparator<String> cmpText = (left, right) -> left.compareTo(right);
        Comparator<String> cmpDescSize = (left, right) -> Integer.compare(left.length(), right.length());

        Arrays.sort(atts, comparator);
        for (Attachment num : atts) {
            System.out.println(num);
        }

    }
}
