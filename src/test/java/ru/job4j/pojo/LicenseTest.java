package ru.job4j.pojo;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class LicenseTest {

    @Test
    public void eqName() {
        License first = new License();
        first.setCode("audio");
        License second = new License();
        second.setCode("audio");
        assertThat(first).isEqualTo(second);
    }

}