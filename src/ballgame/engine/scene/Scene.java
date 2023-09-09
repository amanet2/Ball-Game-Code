package ballgame.engine.scene;

import ballgame.engine.graph.Model;
import ballgame.engine.graph.TextureCache;

import static ballgame.Globals.viddefs;

import java.util.HashMap;
import java.util.Map;

public class Scene {
    private Map<String, Model> modelMap;
    private Projection projection;
    private TextureCache textureCache;

    public Scene() {
        modelMap = new HashMap<>();
        projection = new Projection(viddefs.width, viddefs.height);
        textureCache = new TextureCache();
    }

    public void addEntity(Entity entity) {
        String modelId = entity.getModelId();
        Model model = modelMap.get(modelId);
        if (model == null) {
            throw new RuntimeException("Could not find model [" + modelId + "]");
        }
        model.getEntitiesList().add(entity);
    }

    public void addModel(Model model) {
        modelMap.put(model.getId(), model);
    }

    public void cleanup() {
        modelMap.values().forEach(Model::cleanup);
    }

    public Map<String, Model> getModelMap() {
        return modelMap;
    }

    public Projection getProjection() {
        return projection;
    }

    public TextureCache getTextureCache() {
        return textureCache;
    };

    public void resize(int width, int height) {
        projection.updateProjMatrix(width, height);
    }
}
