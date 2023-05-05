package ru.job4j.stream;

import ru.job4j.stream.mapto.Person;

import java.util.*;

public class MinExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Михаил", 35),
                new Person("Ольга", 26),
                new Person("Антон", 20),
                new Person("Виктор", 16),
                new Person("Анна", 29)
        );
        Optional<Person> yougestPerson = people.stream()
                .min(Comparator.comparing(Person::getAge));

        Optional<Person> youGestPerson = people.stream()
                .max(Comparator.comparing(Person::getAge));
        int ageMax = youGestPerson.get().getAge();
        int age = yougestPerson.get().getAge();
        System.out.println(age);
        System.out.println(ageMax);

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        long sum = nums.stream()
                .filter(e -> e % 2 == 0)
                .count();
        System.out.println(sum);
        OptionalDouble average = people.stream()
                .mapToInt(Person::getAge)
                .average();
        double avg = average.getAsDouble();
        System.out.println(avg);
        int sumAge = people.stream()
                .mapToInt(Person::getAge)
                .sum();
        System.out.println(sumAge);

    }
}
