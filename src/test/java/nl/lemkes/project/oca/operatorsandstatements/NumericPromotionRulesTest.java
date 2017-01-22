package nl.lemkes.project.oca.operatorsandstatements;

import org.junit.Test;

/**
 * Java 8 and the 4 numeric promotion rules;
 *
 * 1. if two values have different data types, Java will automatically promote one of the value to the larger of the two data types;
 * 2. if one of the values is integral and the other is floating-point, java will automatically promote the integral value to the floating-point value's data type;
 * 3. Smaller data types, named byte, short and char are first promoted to int any time they're used with a java binary arithmetic operator, even if neither of the operands is int;
 * 4. After all promotion has occurred and the operands have the same data type, the result value will have the same data type as its promoted operands;
 *
 *
 * Created by hans on 22-1-17.
 */
public class NumericPromotionRulesTest {

    @Test
    public void testRuleOne()
    {
        int x = 1;
        long y = 33;
        long z = x*y; // rule 1;
        //int z = x*y; // does not compile;
    }

    @Test
    public void testRuleTwo()
    {
        int x = 1;
        float y = 2.5F;
        //int z = x * y; //does not compile
        float z = x*y;
        double z1 = x*y;

        double w = 3.5;
        //float z2 = x*w; //does not compile
        double z3 = x*w;
    }

    @Test
    public void testRuleThree()
    {
        byte x = 5;
        short y = 3;
        //short z = x*y; //does not compile
        int z = x*y;
        long z1 = x*y;
    }

    @Test
    public void testRuleFour()
    {
        //with the formula x * y / z;
        short x = 14; //to a int of 14 rule 3;
        float y = 13; // the x will be een float, rule 2;
        double z = 30; // the x*y value will be a double and rule 4 is applied;

        float value = x*y;

        double value2 = x*y / z;
        //float value3 = x*y/z; //does not compile
    }



}
