package TestAssignment2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayingWithStringsTest {

    @Test
    void returnAString() {
        String testString = "aBc";

        PlayingWithStrings pws = new PlayingWithStrings();
        assertEquals("aBc", pws.ReturnAString(testString));
    }

    @Test
    void reverseAString() {
        String testString = "aBc";

        PlayingWithStrings pws = new PlayingWithStrings();
        assertEquals("cBa", pws.ReverseAString(testString));
    }

    @Test
    void capitalizeAString() {
        String testString = "aBc";

        PlayingWithStrings pws = new PlayingWithStrings();
        assertEquals("ABC", pws.CapitalizeAString(testString));
    }

    @Test
    void lowercaseAString() {
        String testString = "aBc";

        PlayingWithStrings pws = new PlayingWithStrings();
        assertEquals("abc", pws.LowercaseAString(testString));
    }
}