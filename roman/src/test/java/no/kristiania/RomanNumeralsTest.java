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

    @Test
    void shouldTransformFourToIV() {
        assertEquals("IV", toRoman(4));
    }

    private String toRoman(int number) {
        String result = "";
        for (int i = 0; i < number; i++) {
            result += "I";
        }
        return result;
    }

}
