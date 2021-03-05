package birthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> birthDates = new ArrayList<>();

        String input = scan.nextLine();

        while (!"End".equals(input)) {
            String[] tokens = input.split(" ");
            String type = tokens[0];

            if ("Citizen".equals(type)) {
                birthDates.add(tokens[4]);
            } else if ("Pet".equals(type)) {
                birthDates.add(tokens[2]);
            }

            input = scan.nextLine();
        }

        String year = scan.nextLine();

        boolean nothing = true;
        for (String birthDate : birthDates) {
            if (birthDate.endsWith(year)) {
                nothing = false;
                System.out.println(birthDate);
            }
        }

        if (nothing) {
            System.out.println("<no output>");
        }
    }
}
