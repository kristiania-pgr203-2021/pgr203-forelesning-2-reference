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

    @Test
    void shouldTransformFiveToV() {
        assertEquals("V", toRoman(5));
    }

    @Test
    void shouldTransformSixToVI() {
        assertEquals("VI", toRoman(6));
    }

    private String toRoman(int number) {
        String result = "";
        if (number == 5) {
            result += "V";
            number -= 5;
        }
        if (number == 4) {
            result += "IV";
            number -= 4;
        }
        for (int i = 0; i < number; i++) {
            result += "I";
        }
        return result;
    }

}
