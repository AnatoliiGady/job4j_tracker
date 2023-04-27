package ru.job4j.fuction;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.*;

public class FunctionInterfaceUsage {
    public static void main(String[] args) {
        List<String> list = List.of("one", "two", "three", "one");
        Supplier<Set<String>> sup = () -> new HashSet<>(list);
        BiConsumer<Integer, String> consumer = (s, s1) -> System.out.println(s + s1);
        Set<String> strings = sup.get();
        int i = 1;
        for (String s : strings) {
            consumer.accept(i++, " is " + s);
        }
        Predicate<String> pred = s -> s.isEmpty();
        System.out.println("Строка пустая: " + pred.test(""));
        System.out.println("Строка пустая: " + pred.test("test"));

        BiPredicate<String, Integer> cond = (s, in) -> s.contains(in.toString());
        System.out.println("Строка содержит под строку: " + cond.test("name123", 123));
        System.out.println("Строка содержит под строку: " + cond.test("name", 123));

        Function<String, Character> func = s -> s.charAt(2);
        System.out.println("Третий символ в строке: " + func.apply("first"));
        System.out.println("Третий символ в строке: " + func.apply("second"));

        BiFunction<String, Integer, String> biFunc = (s, index) -> s.concat(" ").concat(index.toString());
        System.out.println("Результат работы бифункции: " + biFunc.apply("name", 123));
        System.out.println("Результат работы бифункции: " + biFunc.apply("String number", 12345));

        UnaryOperator<StringBuilder> builder = b -> b.reverse();
        System.out.println("Строка после реверса: " + builder.apply(new StringBuilder("String for test")));
        System.out.println("Строка после реверса: " + builder.apply(new StringBuilder("tset rof gnirtS")));

        BinaryOperator<StringBuilder> builders = (b1, b2) -> b1.append(" ").append(b2);
        System.out.println(
                "Строка после объеденения: " + builders.apply(
                        new StringBuilder("First string"),
                        new StringBuilder("Second string")));

    }
}
