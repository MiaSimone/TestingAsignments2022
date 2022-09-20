package TestAssignment1;

import junit.framework.TestCase;

public class FahrenheitToCelciusTest extends TestCase {

    public void testFahrenheit(){
        Temperature temp = new Temperature();

        String expected = "The temperature is " + 86.0 + " fahrenheit";

        assertEquals(expected, temp.fahrenheit(86.0));
    }

    public void testFahrenheitToCelcius(){
        Temperature temp = new Temperature();

        assertEquals(30.0, temp.fahToCel(86.0));
    }


}