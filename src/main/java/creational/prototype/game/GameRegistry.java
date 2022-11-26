package creational.prototype.game;

import java.util.HashMap;
import java.util.Map;

//This is just a wrapper around a map that functions as a data store for different types of prototypes
public class GameRegistry {
    private Map<GraphicalObjectType,GraphicalObject> registry = new HashMap<GraphicalObjectType, GraphicalObject>();

    // Add get and add functions to this registry class
    public void addPrototype(GraphicalObjectType type, GraphicalObject object) {
        this.registry.put(type,object);
    }

    public GraphicalObject getPrototype(GraphicalObjectType type) {
        return this.registry.get(type);
    }
}
