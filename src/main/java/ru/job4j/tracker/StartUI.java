package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item("One Item");
        item.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String dataTime = item.getCreated().format(formatter);
        System.out.println("Дата и время в форматированном варианте: " + dataTime);
        System.out.println(item);
    }
}
