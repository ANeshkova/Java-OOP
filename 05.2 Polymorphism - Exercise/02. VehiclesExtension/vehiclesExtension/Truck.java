package vehiclesExtension;

public class Truck extends Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;
    private int tankCapacity;
    private final static double SUMMER_CONSUMPTION = 1.6;
    private final static double LOSS_OF_TANK = 0.95;

    public Truck(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        super(fuelQuantity, fuelConsumption + SUMMER_CONSUMPTION, tankCapacity);
    }

    @Override
    public void refuel(double fuel) {
        super.refuel(fuel * LOSS_OF_TANK);
    }
}
