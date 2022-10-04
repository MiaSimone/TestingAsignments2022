package TestAssignment2;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
    @Given("the string is aBc")
    public void the_string_is_a_bc() {
        PlayingWithStrings pws = new PlayingWithStrings();
        pws.ReturnAString("aBc");
    }
    @When("the string is reversed")
    public void the_string_is_reversed() {
        PlayingWithStrings pws = new PlayingWithStrings();
        pws.ReverseAString("aBc");
    }
    @Then("the reversed string is cBa")
    public void the_reversed_string_is_c_ba() {
        PlayingWithStrings pws = new PlayingWithStrings();
        String reversed = pws.ReverseAString("aBc");
        pws.ReturnAString(reversed);
    }

    @When("the string is capitalized")
    public void the_string_is_capitalized() {
        PlayingWithStrings pws = new PlayingWithStrings();
        pws.CapitalizeAString("aBc");
    }

    @Then("the capitalized string is ABC")
    public void the_capitalized_string_is_abc() {
        PlayingWithStrings pws = new PlayingWithStrings();
        String capitalized = pws.CapitalizeAString("aBc");
        pws.ReturnAString(capitalized);
    }

    @When("the string is lowercasinized")
    public void the_string_is_lowercasinized() {
        PlayingWithStrings pws = new PlayingWithStrings();
        pws.LowercaseAString("aBc");
    }

    @Then("the lowercasinized string is abc")
    public void the_lowercasinized_string_is_abc() {
        PlayingWithStrings pws = new PlayingWithStrings();
        String lowercased = pws.LowercaseAString("aBc");
        pws.ReturnAString(lowercased);
    }
}
