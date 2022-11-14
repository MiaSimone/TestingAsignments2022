package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class StartGame {
    @Given("we want to play")
    public String weWantToPlay() {
        return "I want to play!";
    }

    boolean methodCalled = false;

    @When("the game is started")
    public void the_game_is_started() {
        GameFrame gf = new GameFrame();
        methodCalled = gf.GameFrame();
    }

    @Then("the game is running")
    public void the_game_is_running() {
        if (methodCalled) {
            System.out.println("Game is running!");
        }
        else {
            System.out.println("Game is not running :(");
        }
    }
}
