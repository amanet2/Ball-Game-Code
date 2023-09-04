package ballgame.engine;

import ballgame.engine.graph.Mesh;

import java.util.HashMap;
import java.util.Map;

public class Scene {
    private Map<String, Mesh> meshMap;
    private Projection projection;

    public Scene() {
        meshMap = new HashMap<>();
        projection = new Projection(1280, 720);
    }

    public void addMesh(String meshId, Mesh mesh) {
        meshMap.put(meshId, mesh);
    }

    public void cleanup() {
        meshMap.values().forEach(Mesh::cleanup);
    }

    public Map<String, Mesh> getMeshMap() {
        return meshMap;
    }

    public Projection getProjection() {
        return projection;
    }
}
