package Exercise2;

public class Universum {
    private final String name;
    private SpaceObject[] spaceObjects;
    private static Universum universum = null;

    private Universum(String name) {
        this.name = name;
    }

    public static Universum getInstance(String name) {
        if (universum == null) {
            universum = new Universum(name);
            return universum;
        }
        return universum;
    }

    public String getName() {
        return name;
    }

    public SpaceObject[] getSpaceObjects() {
        return spaceObjects;
    }

    public void setSpaceObjects(SpaceObject[] spaceObjects) {
        this.spaceObjects = spaceObjects;
    }
}
