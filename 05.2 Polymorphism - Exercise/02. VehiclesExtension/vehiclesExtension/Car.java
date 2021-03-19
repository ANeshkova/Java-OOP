package vehiclesExtension;

public class Car extends Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;
    private int tankCapacity;
    private final static double SUMMER_CONSUMPTION = 0.9;


    public Car(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        super(fuelQuantity, fuelConsumption + SUMMER_CONSUMPTION, tankCapacity);
    }
}
