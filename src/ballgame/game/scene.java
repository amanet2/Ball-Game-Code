package ballgame.game;
import ballgame.things.item;
import ballgame.things.player;

public class scene {
    int MAX_ITEMS = 128;
    int MAX_PLAYERS = 4;
    item[] items;
    player[] players;

    public enum items {
        SPAWNPOINT
    }

    public scene() {
         items = new item[MAX_ITEMS];
    }

    public void addItem(item i) {
        for(int c = 0; c < items.length; c++) {
            if(items[c] == null) {
                items[c] = i;
                return;
            }
            System.out.printf("MAX ITEM LIMIT (%d) REACHED%n", MAX_ITEMS);
        }
    }

    public void addPlayer(player p) {
        for(int c = 0; c < players.length; c++) {
            if(players[c] == null) {
                players[c] = p;
                return;
            }
            System.out.printf("MAX PLAYER LIMIT (%d) REACHED%n", MAX_PLAYERS);
        }
    }
}
