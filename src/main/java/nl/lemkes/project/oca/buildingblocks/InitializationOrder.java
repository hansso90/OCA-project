package nl.lemkes.project.oca.buildingblocks;

/**
 * How goes the compiler through a Class.
 *
 * Created by hans on 22-1-17.
 */
public class InitializationOrder {

    private int value = 1;
    {System.out.println("Setting field.");}

    public InitializationOrder()
    {
        this.value = 2;
        System.out.println("Setting constructor.");
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    {System.out.println("Just a code block at the bottom.");}
}
