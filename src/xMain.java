import things.item;
import items.foobar;

public class xMain {
    public static void main(String[] args) {
        server.bindings[server.PORT_LISTEN] = "sv_port_listen";
        server.vars[server.PORT_LISTEN] = "5555";

        item test = new item();
        item test2 = new foobar();
        item[] items = {test, test2};
        for(item i : items) {
            i.test();
        }
    }
}
