package vehiclesExtension;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] data = reader.readLine().split("\\s+");
        Vehicle car = new Car(Double.parseDouble(data[1]), Double.parseDouble(data[2]), Integer.parseInt(data[3]));

        data = reader.readLine().split("\\s+");
        Vehicle truck = new Truck(Double.parseDouble(data[1]), Double.parseDouble(data[2]), Integer.parseInt(data[3]));

        data = reader.readLine().split("\\s+");
        Vehicle bus = new Bus(Double.parseDouble(data[1]), Double.parseDouble(data[2]), Integer.parseInt(data[3]));

        int n = Integer.parseInt(reader.readLine());

        while (n-- > 0) {
            data = reader.readLine().split("\\s+");

            switch (data[0]) {
                case "Drive":

                    switch (data[1]) {
                        case "Car":
                            car.drive(Double.parseDouble(data[2]));
                            break;
                        case "Truck":
                            truck.drive(Double.parseDouble(data[2]));
                            break;
                        case "Bus":
                            bus.drive(Double.parseDouble(data[2]));
                            break;
                    }
                    break;
                case "DriveEmpty":
                    bus.driveEmptyBus(Double.parseDouble(data[2]));
                    break;
                case "Refuel":
                    switch (data[1]) {
                        case "Car":
                            car.refuel(Double.parseDouble(data[2]));
                            break;
                        case "Truck":
                            truck.refuel(Double.parseDouble(data[2]));
                            break;
                        case "Bus":
                            bus.refuel(Double.parseDouble(data[2]));
                    }
                    break;
            }
        }

        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);
    }
}
