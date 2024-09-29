package Exercise2;

import java.util.Arrays;

public class Star extends SpaceObject implements StarInterface {
    private Planet[] planets;

    public Star(String name, double radius, double weight) {
        super(name, radius, weight);
    }


    @Override
    public String toString() {
        return "Star " + getName() +
               " {radius=" + getRadius() +
               ", weight=" + getWeight() +
               "}\n";
    }

    @Override
    public int getNumberOfPlanets() {
        return planets.length;
    }

    public void setPlanets(Planet[] planets) {
        this.planets = planets;
    }

    public Planet[] getPlanets() {
        return planets;
    }
}
