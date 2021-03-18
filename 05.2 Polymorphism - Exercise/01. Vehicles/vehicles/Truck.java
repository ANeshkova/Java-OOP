package vehicles;

public class Truck extends Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;
    private final static double SUMMER_CONSUMPTION = 1.6;


    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + SUMMER_CONSUMPTION);
    }

    @Override
    public void refuel(double fuel) {
        super.refuel(fuel * 0.95);
    }
}
