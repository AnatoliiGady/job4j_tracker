package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        Predicate<Person> predName = name -> name.getName().contains(key);
        Predicate<Person> predSurname = surname -> surname.getSurname().contains(key);
        Predicate<Person> predIphone = iphone -> iphone.getPhone().contains(key);
        Predicate<Person> predAdress = adress -> adress.getAddress().contains(key);
        Predicate<Person> combine = predName.or(predSurname).or(predIphone).or(predAdress);
        for (var value : persons) {
            combine.test(value);
            result.add(value);
        }
        return result;
    }
}
