package nl.lemkes.project.oca.operatorsandstatements;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for Increments and Decrements operators;
 *
 * Created by hans on 22-1-17.
 */
public class IncrementsOperatorTest {

    @Test
    public void situationOne()
    {
        int x = 2;
        int y = ++x * 8 / x-- + --x;
        assertEquals(y, 9);
        // y = 3 * 8 / x-- + --x;
        // y = 3 * 8 / 3 + --x;
        // y = 3 * 8 / 3 + 1;
        // y = 24 / 3 + 1 = 9;

    }

    @Test
    public void situationTwo()
    {
        int x = 2;
        int y = ++x * 8 / --x + --x;
        assertEquals(y, 13);
        // y = 3 * 8 / --x + --x;
        // y = 3 * 8 / 2 + --x;
        // y = 3 * 8 / 2 + 1;
        // y = 24 / 2 + 1 = 13;
    }

    /**
     * Test met increments operators and logic
     */
    @Test
    public void situationThree()
    {
        int x = 2;
        int y = 6 * x++ / ++x + ++x - 7 * --x;

        // y = 6 * 2 / ++x + ++x - 7 * --X
        // Y = 6 * 2 / 4 + 5 - 7 * 4;
        // y = 12 / 4 + 5 - 28;
        // y = 3 + 5 - 28;
        // y = 8 - 28 = -20
        assertEquals(y, -20);


    }


}
