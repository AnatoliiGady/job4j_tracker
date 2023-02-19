package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель банковского счета клиента
 *
 * @author GADI ANATOLII
 * @version 1.0
 */

public class Account {
    /**
     * Поле хранения реквизитов клиента
     */
    private String requisite;
    /**
     * Поле хранения баланса клиента
     */
    private double balance;

    /**
     * Конструктор класса Account
     *
     * @param requisite реквизиты
     * @param balance баланс
     */

    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Метод позволяет получить реквизиты клента
     *
     * @return возвращаем реквизиты
     */

    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод позволяет принимать реквизиты клиента
     *
     * @param requisite риквизиты
     */

    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод позволяет получить баланс
     *
     * @return возвращаем баланс
     */

    public double getBalance() {
        return balance;
    }

    /**
     * Метод позволяет принимать баланс клиента
     *
     * @param balance баланс
     */

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Переопределенный метод equals
     *
     * @param o объект для сравнения
     * @return возвращает true если объекты равны, и false если не равны
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * Переопределенный метод hashCode
     *
     * @return возвращает целоцисленное значение, используемое для индентификации объекта
     */

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
