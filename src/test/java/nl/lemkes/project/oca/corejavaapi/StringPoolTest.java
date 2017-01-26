package nl.lemkes.project.oca.corejavaapi;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 *
 *
 * Created by hans on 26-1-17.
 */
public class StringPoolTest {


    @Test
    public void stringPoolTest()
    {
        String a = "cat"; //Literal saved in the String Pool
        String b = "cat"; //Literal saved in the String pool. Same reference in the memory.
        String c = new String("cat"); // String saved as een object

        assertEquals(a, b);
        assertEquals(a, c);
        assertEquals(b, c);

        assertTrue(a == b);
        assertFalse(a == c);
        assertFalse(b == c);
    }

}
