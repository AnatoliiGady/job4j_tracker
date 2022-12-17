package ru.job4j.early;

public class PasswordValidator {

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        String passLC = password.toLowerCase();
        if (password.equals(passLC)) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        String passUC = password.toUpperCase();
        if (password.equals(passUC)) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        boolean containDigit = false;
        for (Character ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                containDigit = true;
                break;
            }
        }
        if (!containDigit) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        boolean containSpecialChar = false;
        for (Character ch : password.toCharArray()) {
            if (!Character.isLetter(ch) && !Character.isDigit(ch)) {
                containSpecialChar = true;
                break;
            }
        }
        if (!containSpecialChar) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        String[] wrongSubString = {"qwerty", "12345", "password", "admin", "user"};
        for (String w : wrongSubString) {
            if (password.toLowerCase().contains(w)) {
                throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
            }
        }
        return password;
    }
}