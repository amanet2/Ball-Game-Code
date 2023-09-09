package ballgame.engine.graph;

import org.lwjgl.opengl.GL;
import ballgame.engine.scene.Scene;

import static ballgame.Globals.viddefs;
import static org.lwjgl.opengl.GL11.*;

public class Render {

    private SceneRender sceneRender;

    public Render() {
        GL.createCapabilities();
        glEnable(GL_DEPTH_TEST);
        sceneRender = new SceneRender();
    }

    public void cleanup() {
        sceneRender.cleanup();
    }

    public void render(Scene scene) {
        glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
        glViewport(0, 0, viddefs.width, viddefs.height);

        sceneRender.render(scene);
    }
}