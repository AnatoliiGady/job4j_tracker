package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Gady Anatolii Nikolaevich");
        student.setGroup("Job4j");
        student.setCreated(new Date());

        System.out.println("ФИО: " + student.getName() + "."
                + System.lineSeparator() + "Группа - " + student.getGroup()
                + System.lineSeparator() + "Дата начала обучения: " + student.getCreated());
    }
}
