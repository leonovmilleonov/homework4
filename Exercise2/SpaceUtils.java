package Exercise2;

public final class SpaceUtils {
    private static final double GRAVITY_CONSTANT = 6.71e-11;
    private SpaceUtils(){
    }
    //для корректной работы метода он должен еще принимать расстояние между планетами
    public static double findGravity(SpaceObject obj1, SpaceObject obj2, double distanceInMeter){
        return (GRAVITY_CONSTANT * obj1.getWeight() * obj2.getWeight()) / Math.pow(distanceInMeter, 2);
    }
    public static boolean isStar(SpaceObject obj){
        return obj instanceof Star;
    }
}
