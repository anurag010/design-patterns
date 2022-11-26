package creational.prototype.game;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GameObjectTest {

    @Test
    public void testCloneMethod() {
        // Step 4 - create a prototype
        BackgroundObject prototype = new BackgroundObject(100,100,200,300,"red",GraphicalObjectType.BACKGROUND);
        BackgroundObject clone = prototype.clone();

        assertNotNull("If clone is called, prototype should not be null", clone);
        assertEquals("If X is called, it should be same as prototype",100,(int)clone.getX());

        // Step 5 - modify the clone
        clone.setColor("blue");
        clone.setHeight(500);

    }
}
