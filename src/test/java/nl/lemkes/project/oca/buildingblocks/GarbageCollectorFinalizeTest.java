package nl.lemkes.project.oca.buildingblocks;

import org.junit.Test;

/**
 * Created by hans on 22-1-17.
 */
public class GarbageCollectorFinalizeTest {

    @Test
    public void testFinalizeMethod()
    {
        System.out.println("Making object 1,2,3");
        FinalizeObject object1 = new FinalizeObject(1);
        FinalizeObject object2 = new FinalizeObject(2);
        FinalizeObject object3 = new FinalizeObject(3);

        object1 = object2;
        object2 = null;
        System.gc();
        object3 = object1;
        object1 = null;
        System.gc();
        System.out.println(object3.getObjectCount());
    }
}
