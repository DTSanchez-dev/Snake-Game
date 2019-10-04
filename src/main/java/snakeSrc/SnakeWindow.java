package snakeSrc;

import snakeSrc.maps.GamePanel;

import javax.swing.*;

/**
 * This will be the class that will render the game, updating each tick and the input (as controls)
 */
public class SnakeWindow extends JFrame {

    /**
     * Some settings for the window in the game, the rest will be added
     * with the GamePanel class
     */
    public SnakeWindow() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("DTSnake");
        setContentPane(new GamePanel(720,405));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
