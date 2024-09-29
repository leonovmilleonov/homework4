package Exercise2;

public abstract class SpaceObject implements Acceleration {
    private final String name;
    private final double radius;
    private final double weight;

    public SpaceObject(String name, double radius, double weight) {
        this.name = name;
        this.radius = radius;
        this.weight = weight;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public int compareWeights(SpaceObject spaceObject) {
        if (this.weight > spaceObject.getWeight()) {
            return 1;
        } else {
            if (this.weight < spaceObject.getWeight()) return -1;
            return 0;
        }
    }

    @Override
    public double acceleration() {
        return (Acceleration.GRAVITY_CONSTANT * weight) / Math.pow(radius, 2);
    }

    public abstract String toString();

    public double getRadius() {
        return radius;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {

        return weight;
    }
}
