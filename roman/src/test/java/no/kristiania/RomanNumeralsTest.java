package no.kristiania;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsTest {
    
    @Test
    void shouldTransformOneToI() {
        assertEquals("I", toRoman(1));
    }

    @Test
    void shouldTransformTwoToII() {
        assertEquals("II", toRoman(2));
    }

    private String toRoman(int number) {
        return "I";
    }

}
