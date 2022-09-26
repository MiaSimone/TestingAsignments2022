package TestAssignment1;

import junit.framework.TestCase;

public class NumberConverterTest extends TestCase {

    public void testNumberToNumeral() {

        int number = 160;
        String expected = "CLX";
        NumberConverter nc = new NumberConverter();

        assertEquals(expected, nc.numberToNumeral(number));
    }
}