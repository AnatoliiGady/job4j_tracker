package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.lang.ref.SoftReference;

import static org.assertj.core.api.Assertions.assertThat;

public class UniqueTextTest {

    @Test
    void isEquals() {
        UniqueText uniqueText = new UniqueText();
        String origin = "My cat eats a mouse";
        String text = "My cat eats a mouse";
        assertThat(uniqueText.isEquals(origin, text)).isTrue();
    }

    @Test
    void isNotEquals() {
        UniqueText uniqueText = new UniqueText();
        String origin = "My cat eats a mouse";
        String text = "A mouse is eating by a cat";
        assertThat(uniqueText.isEquals(origin, text)).isFalse();
    }
}