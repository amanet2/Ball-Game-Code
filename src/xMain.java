import things.item;
import items.foobar;

public class xMain {
    public static void main(String[] args) {
        item test = new item();
        item test2 = new foobar();
        item[] items = {test, test2};
        for(item i : items) {
            i.test();
        }
    }
}
