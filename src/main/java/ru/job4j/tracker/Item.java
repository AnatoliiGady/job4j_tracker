package ru.job4j.tracker;

public class Item {
    private int id;
    private String name;

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

    public void printInfo() {
        System.out.println(id);
        System.out.println(name);
    }

    public static void main(String[] args) {
        Item noParameters = new Item();
        noParameters.printInfo();
        Item oneParameters = new Item("Anatolii Gady");
        oneParameters.printInfo();
        Item twoParameters = new Item("Anatolii Gady", 32);
        twoParameters.printInfo();
    }
}