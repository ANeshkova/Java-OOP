package foodShortage;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> citizen = new ArrayList<>();
        List<String> rebel = new ArrayList<>();

        int foodCount = 0;

        int n = Integer.parseInt(scan.nextLine());

        while (n-- > 0) {
            String[] input = scan.nextLine().split(" ");

            if (input.length == 4) {
                citizen.add(input[0]);
            } else if (input.length == 3) {
                rebel.add(input[0]);
            }
        }

        String name = scan.nextLine();

        while (!"End".equals(name)) {

            if (citizen.contains(name)) {
                foodCount += 10;
            } else if (rebel.contains(name)) {
                foodCount += 5;
            }

            name = scan.nextLine();
        }

        System.out.println(foodCount);
    }
}
