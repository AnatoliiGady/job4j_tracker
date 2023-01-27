package ru.job4j.hmap;

public record Label(String name, double score) implements Comparable<Label> { //содержит результаты: имя и балы. Используется как для учениеов так и для предметов
    @Override
    public int compareTo(Label o) {
        return Double.compare(this.score, o.score);
    }
}
