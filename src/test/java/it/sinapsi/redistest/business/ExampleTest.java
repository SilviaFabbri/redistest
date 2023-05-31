package it.sinapsi.redistest.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {

    @Test
    void shouldReturn4() {
        Example a = new Example();
        Double result = a.sum(2.0, 5.0);

        assertEquals(7.0, result);
    }
}