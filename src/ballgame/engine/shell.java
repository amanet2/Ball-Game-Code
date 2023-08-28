package ballgame.engine;
import ballgame.game.adapter;
import ballgame.Globals;

import javax.swing.*;
import java.awt.*;

public class shell extends adapter {
    JFrame frame;
    JLayeredPane contents;

    @Override
    public void init() {
        super.init();
        contents = new JLayeredPane();
        createFrame(Globals.viddefs.width, Globals.viddefs.height);
    }

    public void createFrame(int w, int h) {
        System.out.println(w + "," + h);
        if(frame != null)
            frame.dispose();
        frame = new JFrame("BALL_GAME_" + this);
        frame.setBackground(Color.BLACK);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        contents.setPreferredSize(new Dimension(w, h));
        frame.setContentPane(contents);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
//        frame.setFocusTraversalKeysEnabled(false);
    }
}
