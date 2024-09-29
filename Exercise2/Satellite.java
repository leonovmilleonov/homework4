package Exercise2;

public class Satellite extends SpaceObject implements SatellitInterface {
    private Planet planet;
    private final double distanceToPlanet;

    public Satellite(String name, double radius, double weight, double distanceToPlanet) {
        super(name, radius, weight);
        this.distanceToPlanet = distanceToPlanet;
    }


    @Override
    public String toString() {
        return "Satellit " + getName();
    }

    @Override
    public Planet getPlanet() {
        return planet;
    }

    @Override
    public double orbitLength() {
        return 2 * Math.PI * distanceToPlanet;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }

}
