package creational.builder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class NewDatabaseTest {

    @Test
    public void testNewDatabaseBuilder() {
        NewDatabase newdb = NewDatabase.builder()
                .withName("New database")
                .withUrl("host",8000)
                .withPassword("Super secure password")
                .mysql()
                .build();


        assertNotNull("If builder is called, the instance should not be null",newdb);
        assertEquals("If instance is returned, name should be same as input","New database",newdb.getName());
        System.out.println(newdb);
//        System.out.println(newdb.getName() + newdb.getHost() + newdb.getPort() + newdb.getPassword() + newdb.getType());
    }
}
