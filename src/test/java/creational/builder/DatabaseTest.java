package creational.builder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DatabaseTest {

    @Test
    public void testBuilderMethod() {
        Database database = Database.builder()
                .mysql()
                .withName("test")
                .withUrl("url",3000)
                .withPassword("password")
                .build();

        System.out.println(database.getType());
        assertNotNull("If builder is called, the instance should not be null",database);
        assertEquals("If instance is returned, name should be same as input","test",database.getName());
        assertEquals("Checking if the database type is mentioned correctly","MYSQL",database.getType().toString());

    }
}
