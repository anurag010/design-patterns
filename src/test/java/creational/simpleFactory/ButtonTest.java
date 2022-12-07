package creational.simpleFactory;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ButtonTest {
    @Test
    public void testSimpleFactory(){
        Button primary = ButtonFactory.createButton(ButtonType.PRIMARY);

        assertNotNull("If Button type is valid, the instance returned should not be null", primary);
        assertTrue("If Button type is primary, the instance returned should be of type primary as well", primary instanceof PrimaryButton);
    }
}
