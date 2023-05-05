package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
        //TODO пример работы конечной операции forEach
        List<String> strings = Arrays.asList("ОДИН", "ДВА", "ТРИ");
        strings.stream()
                .map(String::toLowerCase)
                .forEach(System.out::println);
// TODO пример работы промежуточной оперции peek
        List<StringBuilder> names = Arrays.asList(
                new StringBuilder("Михаил"), new StringBuilder("Иван"), new StringBuilder("Елена"));
        List<StringBuilder> editedNames = names.stream()
                .peek((el) -> el.append(" (Ученик job4j)"))
                .sorted()
                .toList();
        System.out.println(editedNames);
    }

}
