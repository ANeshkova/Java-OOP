package vehicles;

import java.text.DecimalFormat;

public abstract class Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;

    Vehicle(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }

    public void drive(double km) {
        DecimalFormat format = new DecimalFormat("#.##");

        if (this.fuelConsumption * km <= this.fuelQuantity) {

            this.fuelQuantity = this.fuelQuantity - (this.fuelConsumption * km);
            System.out.println(String.format("%s travelled %s km", this.getClass().getSimpleName(), format.format(km)));

        } else {
            System.out.println(String.format("%s needs refueling", this.getClass().getSimpleName()));
        }
    }

    public void refuel(double fuel) {
        this.fuelQuantity += fuel;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuelQuantity);
    }
}
