import things.item;
import items.foobar;
import engine.session;
import engine.shell;

public class xMain {
    public static void main(String[] args) {
        item test = new item();
        item test2 = new foobar();
        item[] items = {test, test2};
        for(item i : items) {
            i.test();
        }

        new session(new shell(), 60);
    }
}
