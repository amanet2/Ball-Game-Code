import ballgame.engine.session;
import ballgame.game.shell;

import static ballgame.Globals.viddefs;

public class BallGame {
    public static void main(String[] launchArgs) {

        viddefs.x = 0;
        viddefs.y = 0;
        viddefs.width = 1920;
        viddefs.height = 1080;

        new session(new shell(), 60);
    }
}
