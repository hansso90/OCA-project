package nl.lemkes.project.oca.buildingblocks;

/**
 * Created by hans on 22-1-17.
 */
public class FinalizeObject {

    private int objectCount;

    public FinalizeObject(int value) {
        this.objectCount = value;
    }

    public int getObjectCount() {
        return objectCount;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Destroy object " + objectCount);
    }
}
