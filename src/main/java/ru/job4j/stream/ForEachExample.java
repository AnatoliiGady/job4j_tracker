package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("ОДИН", "ДВА", "ТРИ");
        strings.stream()
                .map(String::toLowerCase)
                .forEach(System.out::println);
        List<StringBuilder> names = Arrays.asList(
                new StringBuilder("Михаил"), new StringBuilder("Иван"), new StringBuilder("Елена"));
        List<StringBuilder> editedNames = names.stream()
                .peek((el) -> el.append(" (Ученик job4j)"))
                .sorted()
                .toList();
        System.out.println(editedNames);
    }

}
