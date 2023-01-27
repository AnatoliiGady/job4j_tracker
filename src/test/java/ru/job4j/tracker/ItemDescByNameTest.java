package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ItemDescByNameTest {

    @Test
    public void sortRevers() {
        List<Item> items = Arrays.asList(
                new Item("Number1"),
                new Item("Number4"),
                new Item("Number2"),
                new Item("Number3"),
                new Item("Number5")
        );
        List<Item> expected = Arrays.asList(
                new Item("Number5"),
                new Item("Number4"),
                new Item("Number3"),
                new Item("Number2"),
                new Item("Number1")
        );
        items.sort(new ItemDescByName());
        assertThat(items).isEqualTo(expected);
    }
}