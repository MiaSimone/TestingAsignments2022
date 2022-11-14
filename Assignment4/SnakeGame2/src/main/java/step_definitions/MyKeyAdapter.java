package step_definitions;

public class MyKeyAdapter {

    public String keyPressed(String direction, String action) {
        if (action == "up" && direction != "down") {
            return "Going up!";
        }
        else if (action == "down" && direction != "up") {
            return "Going down!";
        }
        else if (action == "right" && direction != "left") {
            return "Going right!";
        }
        else if (action == "left" && direction != "right") {
            return "Going left!";
        }
        else return "Error :(";
    }
}
