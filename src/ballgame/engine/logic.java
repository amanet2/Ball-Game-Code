package ballgame.engine;

public interface logic {
    void init();

    void loop();

    void input();

    void update();

    void render();

    void cleanup();

    void disconnect();

    boolean shouldClose();
}
