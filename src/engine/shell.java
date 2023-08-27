package engine;
import game.adapter;

import javax.swing.*;
import java.awt.*;

public class shell extends adapter {
    JFrame frame;
    JLayeredPane contents;

    @Override
    public void init() {
        super.init();
        contents = new JLayeredPane();
        createFrame();
    }

    public void createFrame() {
        if(frame != null)
            frame.dispose();
        frame = new JFrame("BALL_GAME_" + this);
        frame.setBackground(Color.BLACK);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        contents.setPreferredSize(new Dimension(1280, 720));
        frame.setContentPane(contents);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
//        frame.setFocusTraversalKeysEnabled(false);
    }
}
