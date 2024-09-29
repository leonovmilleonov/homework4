package Exercise2;

public class Planet extends SpaceObject implements PlanetInterface {
    private Star star;
    private final double distanceToStar;
    private final double orbitalSpeed;
    private Satellite[] satellites;

    public Planet(String name, double radius, double weight, double distanceToStar, double orbitalSpeed) {
        super(name, radius, weight);
        this.distanceToStar = distanceToStar;
        this.orbitalSpeed = orbitalSpeed;
    }

    @Override
    public Star getStar() {
        return star;
    }

    @Override
    public double howLongIsOneYearInSeconds() {
        return (2 * Math.PI * distanceToStar) / orbitalSpeed;
    }

    @Override
    public String toString() {
        return "Planet " + getName() +
               " = {radius=" + getRadius() +
               ", weight=" + getWeight() +
               ", distanceToStar=" + distanceToStar +
               ", orbitalSpeed=" + orbitalSpeed +
               "}\n";
    }

    //------------------getters and setters--------------------------

    public void setStar(Star star) {
        this.star = star;
    }

    public double getDistanceToStar() {
        return distanceToStar;
    }

    public double getOrbitalSpeed() {
        return orbitalSpeed;
    }

    public void setSatellites(Satellite[] satellites) {
        this.satellites = satellites;
    }

    public Satellite[] getSatellites() {
        return satellites;
    }
}
