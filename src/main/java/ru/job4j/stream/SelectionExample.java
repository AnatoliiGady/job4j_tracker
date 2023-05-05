package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

public class SelectionExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Один", "Два", "Три", "Четыре", "Пять");
        List<String> rsl = strings
                .stream()
                .skip(2)
                .toList();
        System.out.println(rsl);
        List<String> result = strings
                .stream()
                .limit(3)
                .toList();
        System.out.println(result);
        String rsl1 = strings
                .stream()
                .skip(2)
                .limit(2)
                .findFirst()
                .orElse("По умолчанию");
        System.out.println(rsl1);
        String res2 = strings
                .stream()
                .skip(strings.size() - 1) // устанавливается количество пропускаемых элементов
                .findFirst()
                .orElse("По умолчанию");
        System.out.println(res2);
        List<String> strings1 = Arrays.asList("1", "2", "3", "4", "5");
        strings1.stream()
                .mapToInt(Integer::parseInt)
                .filter(e -> e % 2 == 0)
                .forEach(System.out::println);
    }
}
