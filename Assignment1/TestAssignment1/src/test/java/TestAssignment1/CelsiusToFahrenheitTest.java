package TestAssignment1;

import junit.framework.TestCase;

public class CelsiusToFahrenheitTest extends TestCase {

    public void testCelcius(){
        Temperature temp = new Temperature();

        String expected = "The temperature is " + 30 + " celcius";

        assertEquals(expected, temp.celcius(30));
    }

    public void testCelToFah() {
        Temperature temp = new Temperature();

        assertEquals(86.0, temp.celToFah(30));
    }

//    public void testButtonClickFail(){
//        Button button = new Button();
//
//        boolean click = false;
//
//        assertEquals(click, button.clickButton(click));
//    }

    public void testButtonClick(){
        Button button = new Button();

        assertEquals(true, button.clickButton(false));
    }

    public void testDoubleButtonClick(){
        Button button = new Button();

        boolean click = button.clickButton(false);
        boolean unClick = button.clickButton(click);

        assertEquals(true, click);
        assertEquals(false, unClick);
    }

}