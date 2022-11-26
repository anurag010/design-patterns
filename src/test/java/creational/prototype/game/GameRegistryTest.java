package creational.prototype.game;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GameRegistryTest {

    private GameRegistry registry = new GameRegistry();
    @Test
    public void testRegistry() {
        BackgroundObject prototype = new BackgroundObject(100,200,300,400,"black",GraphicalObjectType.BACKGROUND);

        registry.addPrototype(GraphicalObjectType.BACKGROUND,prototype);
        BackgroundObject clone = (BackgroundObject) registry.getPrototype(GraphicalObjectType.BACKGROUND).clone();
        clone.setColor("blue");

        assertNotNull("If clone method is called, it should return a new object", clone);
        assertEquals("If clone method is called, it should return same value for x", prototype.getX(), clone.getX());

    }
}
