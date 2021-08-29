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
    
    @Test
    void shouldTransformNineToIX() {
        assertEquals("IX", toRoman(9));
    }
    
    

    private String toRoman(int number) {
        StringBuilder result = new StringBuilder();
        number = convertRomanDigits(number, result, 9, "IX");
        number = convertRomanDigits(number, result, 5, "V");
        number = convertRomanDigits(number, result, 4, "IV");

        for (int i = 0; i < number; i++) {
            result.append("I");
        }
        return result.toString();
    }

    private int convertRomanDigits(int number, StringBuilder result, int value, String romanDigits) {
        if (number >= value) {
            result.append(romanDigits);
            number -= value;
        }
        return number;
    }

}
