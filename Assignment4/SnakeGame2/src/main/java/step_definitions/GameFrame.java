package step_definitions;

import javax.swing.*;

public class GameFrame extends JFrame {
    public boolean GameFrame() {
        try {
            this.add(new GamePanel());
            this.setTitle("Snake");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setResizable(false);
            this.pack();
            this.setVisible(true);
            this.setLocationRelativeTo(null);

            return true;
        }
        catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

//    GameFrame(){
//        this.add(new GamePanel());
//        this.setTitle("Snake");
//        this.setDefaultCloseOperation();
//    }
}
