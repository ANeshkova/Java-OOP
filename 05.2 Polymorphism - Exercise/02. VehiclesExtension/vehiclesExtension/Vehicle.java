package vehiclesExtension;

import java.text.DecimalFormat;

public abstract class Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;
    private int tankCapacity;
    private static final double BUS_CONSUMPTION_WITHOUT_PEOPLE = 1.4;

    protected Vehicle(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
    }

    public void drive(double km) {
        DecimalFormat format = new DecimalFormat("#.##");
        if (this.fuelConsumption * km <= this.fuelQuantity) {
            this.fuelQuantity = this.fuelQuantity - (this.fuelConsumption * km);
            System.out.println(String.format("%s travelled %s km", this.getClass().getSimpleName(), format.format(km)));

            if (this.fuelQuantity == 0) {
                System.out.println(String.format("%s needs refueling", this.getClass().getSimpleName()));
            }

        } else {
            System.out.println(String.format("%s needs refueling", this.getClass().getSimpleName()));
        }
    }

    public void driveEmptyBus(double km) {
        DecimalFormat format = new DecimalFormat("#.##");

        double emptyConsumption = this.fuelConsumption - BUS_CONSUMPTION_WITHOUT_PEOPLE;

        if (emptyConsumption * km <= this.fuelQuantity) {

            this.fuelQuantity -= (emptyConsumption * km);
            System.out.println(String.format("%s travelled %s km", this.getClass().getSimpleName(), format.format(km)));
        }

        System.out.println(String.format("%s needs refueling", this.getClass().getSimpleName()));
    }

    public void refuel(double fuel) {
        if (fuel <= 0) {
            System.out.println("Fuel must be a positive number");

        } else {
            if (this.fuelQuantity + fuel > this.tankCapacity) {
                System.out.println("Cannot fit fuel in tank");
            } else {
                this.fuelQuantity += fuel;
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuelQuantity);
    }
}
