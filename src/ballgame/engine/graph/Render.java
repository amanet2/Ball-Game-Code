package ballgame.engine.graph;

import org.lwjgl.opengl.GL;
import ballgame.engine.Scene;

import static org.lwjgl.opengl.GL11.*;

public class Render {

    private SceneRender sceneRender;

    public Render() {
        GL.createCapabilities();
        sceneRender = new SceneRender();
    }

    public void cleanup() {
        sceneRender.cleanup();
    }

    public void render(Scene scene) {
        glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
        glViewport(0, 0, 1280, 720);

        sceneRender.render(scene);
    }
}