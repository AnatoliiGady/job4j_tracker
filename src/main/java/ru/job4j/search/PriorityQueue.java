package ru.job4j.search;

import java.util.LinkedList;

/**
 * Класс описывает работу простейшей очереди по приоритету, которая работает
 * по принципу FIFO (firs in - first out)
 *
 * @author GADY ANATOLII
 * @version 1.0
 */
public class PriorityQueue {
    /**
     * Хранение задания осуществляется в колекции типа LinkedList
     */

    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод принимает на вход заявку и добавляет ее в очередь.
     * Если встречается два задания с одинаковым приоритетом, то в очереди
     * они распределятся по принципу FIFO.
     *
     * @param task задача которая добовляется в очередь
     */
    public void put(Task task) {
        var index = 0;
        for (var element : tasks) {
            if (element.getPriority() > task.getPriority()) {
                break;
            }
            index++;
        }
        this.tasks.add(index, task);
    }

    /**
     * Метод позволяет получить первую задачу в очереди
     *
     * @return возвращает первую задачу с головы очереди или null если очередь пуста
     */
    public Task take() {
        return tasks.poll();
    }

}
