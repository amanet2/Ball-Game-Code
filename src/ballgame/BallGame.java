package ballgame;

import ballgame.things.item;
import ballgame.items.foobar;
import ballgame.engine.session;
import ballgame.engine.shell;

import static ballgame.Globals.viddefs;


public class BallGame {
    public static void main(String[] launchArgs) {
        item test = new item();
        item test2 = new foobar();
        item[] items = {test, test2};
        for(item i : items) {
            i.test();
        }

        viddefs.width = 1280;
        viddefs.height = 720;

        new session(new shell(), 60);
    }
}
