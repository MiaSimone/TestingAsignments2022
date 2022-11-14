package step_definitions;

import org.junit.jupiter.api.Test;
import step_definitions.MyKeyAdapter;

import static org.junit.jupiter.api.Assertions.*;

class MyKeyAdapterTest {

    @Test
    void keyPressed() {
        MyKeyAdapter mka = new MyKeyAdapter();
        String direction = "up";
        String action = "right";
        String result = mka.keyPressed(direction, action);
        assertEquals("Going right!", result);
    }
}