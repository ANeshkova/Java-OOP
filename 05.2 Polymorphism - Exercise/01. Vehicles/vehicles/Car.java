package vehicles;

public class Car extends Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;
    private final static double SUMMER_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + SUMMER_CONSUMPTION);
    }
}
