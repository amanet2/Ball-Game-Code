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
        createFrame(Globals.viddefs.x, Globals.viddefs.y, Globals.viddefs.width, Globals.viddefs.height);
    }

    public void createFrame(int x, int y, int w, int h) {
        if(frame != null)
            frame.dispose();
        frame = new JFrame("BALL_GAME_" + this);
        frame.setBackground(Color.BLACK);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        contents.setPreferredSize(new Dimension(w, h));
        frame.setContentPane(contents);
        frame.pack();
        if(x < 0 || y < 0)
            frame.setLocationRelativeTo(null);
        else
            frame.setLocation(x, y);
        frame.setVisible(true);
//        frame.setFocusTraversalKeysEnabled(false);
    }
}
