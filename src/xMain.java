import things.item;
import items.foobar;

public class xMain {
    static int SERVERVAR_COUNT = 128;
    static int PORT_LISTEN = 0;
    static String[] serverVars = new String[MAX_STARTUPVAR_COUNT];
    public static void main(String[] args) {
        serverVars[PORT_LISTEN] = "5555";
        item test = new item();
        item test2 = new foobar();
        item[] items = {test, test2};
        for(item i : items) {
            i.test();
        }
    }
}
