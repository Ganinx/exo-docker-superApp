package org.example;


import org.example.model.Calculatrice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    void testAdditionner() {
        Calculatrice calc = new Calculatrice();
        assertEquals(5, calc.additionner(2, 3));
        assertEquals(0, calc.additionner(-1, 1));
        assertEquals(-3, calc.additionner(-1, -2));
    }
}
