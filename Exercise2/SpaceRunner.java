package Exercise2;

import java.util.*;

public class SpaceRunner {
    public static void main(String[] args) {
        Universum universum = Universum.getInstance("Milky Way");
        Star sun = new Star("Sun", 6.96e8, 1.99e30);
        List<SpaceObject> spaceObjects = new LinkedList<SpaceObject>();
        spaceObjects.add(sun);

        //create all planets from solar system
        Planet mercury = new Planet("Mercury", 2.4e6, 3.3e23, 58e9, 47.3);
        Planet venus = new Planet("Venus", 6e6, 4.9e24, 108e9, 35);
        Planet earth = new Planet("Earth", 6.3e6, 5.9e24, 149e9, 29);
        Planet mars = new Planet("Mars", 3.4e6, 6.39e23, 228e9, 24);
        Planet jupiter = new Planet("Jupiter", 70e6, 1.9e27, 778.5e9, 13);
        Planet saturn = new Planet("Saturn", 58e6, 5.7e26, 1.4e12, 9.7);
        Planet uranus = new Planet("Uranus", 25.3e6, 8.7e25, 2.8e12, 6.8);
        Planet neptune = new Planet("Neptune", 24.6e6, 1e26, 4.5e12, 5.4);

        spaceObjects.add(mercury);
        spaceObjects.add(venus);
        spaceObjects.add(earth);
        spaceObjects.add(mars);
        spaceObjects.add(jupiter);
        spaceObjects.add(saturn);
        spaceObjects.add(uranus);
        spaceObjects.add(neptune);


        //add moon
        Satellite moon = new Satellite("Moon", 1.7e6, 7.36e22, 384e6);
        earth.setSatellites(new Satellite[]{moon});
        spaceObjects.add(moon);

        //set sun for all planets
        mercury.setStar(sun);
        venus.setStar(sun);
        earth.setStar(sun);
        mars.setStar(sun);
        jupiter.setStar(sun);
        saturn.setStar(sun);
        uranus.setStar(sun);
        neptune.setStar(sun);

        //set all planets for sun
        sun.setPlanets(new Planet[]{mercury, venus, earth, mars, jupiter, saturn, uranus, neptune});

        //test methods for earth as example
        System.out.print(earth.getStar());
        System.out.println(earth.howLongIsOneYearInSeconds());
        System.out.println(earth);
        System.out.println(Arrays.toString(earth.getSatellites()));

        //test methods for star as example
        System.out.println(sun.getNumberOfPlanets());
        System.out.println(Arrays.toString(sun.getPlanets()));

        System.out.println(spaceObjects);
    }
}
