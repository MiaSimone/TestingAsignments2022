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
        start = button.buttonClick(start);

    }

    @Then("{int} celcius in fahrenheit should be displayed")
    public void celcius_in_fahrenheit_should_be_displayed(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        Temperature temp = new Temperature();
        double fah = temp.celToFah(int1);
    }

}
