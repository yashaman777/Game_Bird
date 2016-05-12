package flappyBird;


import javax.swing.*;
import java.awt.*;

/**
 * Created by yasha on 12.05.2016.
 */
public class Randerer extends JPanel {

    private static final long serialVersionUID = 1L;

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        FlappyBird.flappyBird.repaint(g);
    }
}
