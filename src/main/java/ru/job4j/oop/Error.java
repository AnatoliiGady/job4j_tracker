package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Имеется ошибка: " + active);
        System.out.println("Код ошибки: " + status);
        System.out.println("Тип ошибки: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error error1 = new Error(true, 1, "Fatal Error!");
        Error error2 = new Error(true, 2, "Error №452!");
        error.printInfo();
        System.out.println();
        error1.printInfo();
        System.out.println();
        error2.printInfo();
    }
}
