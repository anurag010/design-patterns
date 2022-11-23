package creational.builder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DatabaseLombokTest {

    @Test
    public void testBuilderDatabaseLombok() {
        DatabaseLombok db = DatabaseLombok.builder()
                .name("Hello")
                .host("host")
                .port(1234)
                .password("super secure password")
                .build();

        System.out.println(db.toString());
        assertNotNull("If builder is called, the instance should not be null",db);
        assertEquals("If instance is returned, name should be same as input","Hello",db.getName());

    }
}
