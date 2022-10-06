package ru.job4j.pojo;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ShopTest {
    @Test
    public void whenLastNull() {
        Product[] product = new Product[5];
        product[0] = new Product("Milk", 10);
        product[1] = new Product("Bread", 4);
        product[2] = new Product("Egg", 19);
        int rsl = Shop.indexOfNull(product);
        int expected = 3;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenFirstNull() {
        Product[] product = new Product[5];
        product[1] = new Product("Milk", 10);
        int rsl = Shop.indexOfNull(product);
        int expected = 0;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenHasNotNull() {
    Product[] product = new Product[1];
    product[0] = new Product("Milk", 10);
    int rsl = Shop.indexOfNull(product);
    int expected = -1;
    assertThat(rsl).isEqualTo(expected);
    }
}