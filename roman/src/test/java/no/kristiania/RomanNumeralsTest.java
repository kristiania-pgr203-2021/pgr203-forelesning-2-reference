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

    @Test
    void shouldTransformThreeToIII() {
        assertEquals("III", toRoman(3));
    }

    private String toRoman(int number) {
        if (number == 2) {
            return "II";
        }
        return "I";
    }

}
