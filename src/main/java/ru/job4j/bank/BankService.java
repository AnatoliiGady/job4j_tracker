package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Главный сервис
 *
 * @author GADI ANATOLII
 * @version 1.0
 */

public class BankService {
    /**
     * Поле содержит всех пользователей системы с привязанными к ним счетами
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод позволяет добавить пользователя в систему
     *
     * @param user пользователь
     */

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод позволяющий удалить пользователя из системы
     *
     * @param passport паспорт
     * @return возвращает true если пользователь удален из системы или
     * false если пользователь не удален
     */

    public boolean deleteUser(String passport) {
        return users.remove(new User(passport, "")) != null;
    }

    /**
     * Метод позволяет добавить новый счет к пользователю, если такой счет отсутствует
     * у пользователя
     *
     * @param passport паспорт
     * @param account  аккаунт
     */

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод ищет пользователя по данным паспорта
     *
     * @param passport паспорт
     * @return возвращает пользователя
     */

    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(s -> s.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод ищет счет пользователя по паспорту и по реквизитам
     *
     * @param passport  паспорт
     * @param requisite реквизиты
     * @return возвращает счет пользователя
     */

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            return users.get(user)
                    .stream()
                    .filter(s -> s.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    /**
     * Метод перечисляет деньги с одного счета на другой счет
     * Если денег не хватает для перевода, деньги не снимуться и не переведутся
     *
     * @param srcPassport   данные паспорта пользователя с которого переводят деньги
     * @param srcRequisite  реквизиты пользователя с которого переводят деньги
     * @param destPassport  данные паспорта пользователя на который переводят деньги
     * @param destRequisite реквизиты пользователя на который переводят деньги
     * @param amount        сумма перевода
     * @return возвращает true если перевод прошел удачно и
     * false если перевод не прошел
     */

    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }

    /**
     * Метод получает аккаунты
     *
     * @param user пользователь
     * @return возвращает список всех аккаунтов
     */

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
