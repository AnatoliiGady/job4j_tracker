package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item {
    private int id;
    private String name;
    private LocalDateTime created = LocalDateTime.now();
    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");

    public Item() {
    }

    public Item(String name) {
        this.name = name;
    }

    public Item(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    @Override
    public String toString() {
        return "Item{" + "id = " + id + ", name = " + name
                + '\'' + ", created = " + created.format(FORMATTER) + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Item item)) {
            return false;
        }
        if (id != item.id) {
            return false;
        }
        if (!name.equals(item.name)) {
            return false;
        }
        return created.equals(item.created);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + created.hashCode();
        return result;
    }
}