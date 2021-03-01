package borderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Identifiable> identifiableList = new ArrayList<>();

        String input = scan.nextLine();

        while (!"End".equals(input)) {
            String[] tokens = input.split("\\s+");

            Identifiable current;

            if (tokens.length == 3) {
                current = new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
            } else {
                current = new Robot(tokens[0], tokens[1]);
            }

            identifiableList.add(current);

            input = scan.nextLine();
        }

        String idEnd = scan.nextLine();

        for (Identifiable identifiable : identifiableList) {
            if (identifiable.getId().endsWith(idEnd)) {
                System.out.println(identifiable.getId());
            }
        }
    }
}
