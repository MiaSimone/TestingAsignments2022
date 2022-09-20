package TestAssignment1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {


    @Given("{int} celcius")
    public void celcius(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        Temperature temp = new Temperature();
        String celcius = temp.celcius(int1);
    }

    @When("I click the button")
    public void i_click_the_button() {
        // Write code here that turns the phrase above into concrete actions
        boolean start = false;

        Button button = new Button();
        start = button.clickButton(start);

    }

    @Then("{int} celcius in fahrenheit should be displayed")
    public void celcius_in_fahrenheit_should_be_displayed(double cel) {
        // Write code here that turns the phrase above into concrete actions
        Temperature temp = new Temperature();
        double fah = temp.celToFah(cel);
    }


    @Given("{double} fahrenheit")
    public void fahrenheit(Double double1) {
        // Write code here that turns the phrase above into concrete actions
        Temperature temp = new Temperature();

        String fahrenheit = temp.fahrenheit(double1);
    }
    @Then("{double} fahrenheit in celcius should be displayed")
    public void fahrenheit_in_celcius_should_be_displayed(Double double1) {
        // Write code here that turns the phrase above into concrete actions
        Temperature temp = new Temperature();

        double cel = temp.fahToCel(double1);
    }
}
