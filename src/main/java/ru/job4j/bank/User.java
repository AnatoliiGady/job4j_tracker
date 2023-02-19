package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель пользователя банка
 *
 * @author GADI ANATOLII
 * @version 1.0
 */

public class User {
    /**
     * Поле данных паспорта
     */
    private String passport;
    /**
     * Поле имени пользователя банка
     */
    private String username;

    /**
     * Конструктор класса User
     *
     * @param passport паспорт
     * @param username имя
     */

    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод позволяет получить данные паспорта пользователя
     *
     * @return возвращает данные паспорта
     */

    public String getPassport() {
        return passport;
    }

    /**
     * Метод позволяет принимать данные паспорта пользователя банка
     *
     * @param passport паспорт
     */

    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод позволяет получать имя пользователя банка
     *
     * @return возвращает имя пользователя
     */

    public String getUsername() {
        return username;
    }

    /**
     * Метод позволяет принимать имя пользователя банка
     *
     * @param username имя
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Переопределенный метод equals
     *
     * @param o объект для сравнения
     * @return возвращает true если объекты равны, и false если объекты не равны
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Переопределенный метод hashCode
     *
     * @return возвращает целочисленное значение, используемое для интентификации объекта
     */

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
