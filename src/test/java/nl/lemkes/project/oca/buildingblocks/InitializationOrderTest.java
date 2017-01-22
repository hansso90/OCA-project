package nl.lemkes.project.oca.buildingblocks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hans on 22-1-17.
 */
public class InitializationOrderTest {

    @Test
    public void TestInitializationOrderTest()
    {
        InitializationOrder order = new InitializationOrder();
        assertEquals(order.getValue(), 2);
    }
}
