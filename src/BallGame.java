import ballgame.engine.session;
import ballgame.game.shell;


public class BallGame {
    public static void main(String[] launchArgs) {
        new session(new shell(), 60);
    }
}
