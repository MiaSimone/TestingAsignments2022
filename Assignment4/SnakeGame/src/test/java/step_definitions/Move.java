package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Move {

    @Given("the snake is moving east or west")
    public String the_snake_is_moving_east_or_west() {
        String snakeDirection = "right";
        return snakeDirection;
    }
    @When("we press up arrow")
    public String we_press_up_arrow() {
        String action = "up";
        return action;
    }
    @Then("the snake turns north")
    public void the_snake_turns_north() {
        MyKeyAdapter mka = new MyKeyAdapter();

        String direction = the_snake_is_moving_east_or_west();
        String action = we_press_up_arrow();

        String result = mka.keyPressed(direction, action);
        System.out.println(result);
    }

    @When("we press down arrow")
    public String we_press_down_arrow() {
        String action = "down";
        return action;
    }
    @Then("the snake turns south")
    public void the_snake_turns_south() {
        MyKeyAdapter mka = new MyKeyAdapter();

        String direction = the_snake_is_moving_east_or_west();
        String action = we_press_down_arrow();

        String result = mka.keyPressed(direction, action);
        System.out.println(result);
    }



    @Given("the snake is moving north or south")
    public String the_snake_is_moving_north_or_south() {
        String snakeDirection = "up";
        return snakeDirection;
    }
    @When("we press right arrow")
    public String we_press_right_arrow() {
        String action = "right";
        return action;
    }
    @Then("the snake turns east")
    public void the_snake_turns_east() {
        MyKeyAdapter mka = new MyKeyAdapter();

        String direction = the_snake_is_moving_north_or_south();
        String action = we_press_right_arrow();

        String result = mka.keyPressed(direction, action);
        System.out.println(result);
    }

    @When("we press left arrow")
    public String we_press_left_arrow() {
        String action = "left";
        return action;
    }
    @Then("the snake turns west")
    public void the_snake_turns_west() {
        MyKeyAdapter mka = new MyKeyAdapter();

        String direction = the_snake_is_moving_north_or_south();
        String action = we_press_left_arrow();

        String result = mka.keyPressed(direction, action);
        System.out.println(result);
    }
}
