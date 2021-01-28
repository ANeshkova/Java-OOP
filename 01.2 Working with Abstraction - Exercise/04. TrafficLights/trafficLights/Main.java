package trafficLights;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TrafficLight[] lights = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(TrafficLight::valueOf)
                .toArray(TrafficLight[]::new);

        int n = Integer.parseInt(scan.nextLine());

        TrafficLight[] trafficLights = TrafficLight.values();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < lights.length; j++) {

                TrafficLight light = lights[j];
                int nextIndex = light.ordinal() + 1;
                TrafficLight value = trafficLights[nextIndex % trafficLights.length];
                lights[j] = value;

                System.out.print(value + " ");
            }

            System.out.println();
        }
    }
}
