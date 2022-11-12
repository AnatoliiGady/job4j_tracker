package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CountTest {

    @Test
    public void whenException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    Count.add(10, 2);
                });
        assertThat(exception.getMessage()).isEqualTo("Start should be less than finish");
    }

    @Test
    public void whenStart1Finish10Summa45() {
        int start = 1;
        int finish = 10;
        int expected = 45;
        int result = Count.add(start, finish);
        assertThat(result).isEqualTo(expected);
    }
}