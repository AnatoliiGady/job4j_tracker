package ru.job4j.tracker;

public class Item {
    private int id;
    private String name;

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

    public void printInfo() {
        System.out.println(id);
        System.out.println(name);
    }

    public static void main(String[] args) {
        Item item = new Item();
        item.printInfo();
        System.out.println();
        Item item1 = new Item();
        item1.setName("Anatolii Gady");
        item1.printInfo();
        System.out.println();
        Item item2 = new Item();
        item2.setId(32);
        item2.setName("Anatolii Gady");
        item2.printInfo();

    }
}