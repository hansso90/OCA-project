package nl.lemkes.project.oca.buildingblocks;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * Formule to calculate the max of primitive type:
 *
 * !Formula!
 * 2 the mach number in bit, divide by 2 minus 1;
 * Minus 1 because the 0 is also a number.
 *
 * Created by hans on 22-1-17.
 */
public class MaxNumericTest {

    //8-bit
    private byte maxByte = Byte.MAX_VALUE;

    //16-bit
    private short maxShort = Short.MAX_VALUE;

    //32-bit
    private int maxInt = Integer.MAX_VALUE;

    //64-bit
    private long maxLong = Long.MAX_VALUE;

    //32-bit
    private float maxFloat = Float.MAX_VALUE;

    //64-bit
    private double maxDouble = Double.MAX_VALUE;


    @Test
    public void printMaxOfType()
    {
        System.out.println("Byte:       " + maxByte);
        System.out.println("Short:      "+ maxShort);
        System.out.println("Integer:    "+ maxInt );
        System.out.println("Long:       "+ maxLong);
        System.out.println("Float:      "+ maxFloat);
        System.out.println("Double:     "+ maxDouble);
    }

}
