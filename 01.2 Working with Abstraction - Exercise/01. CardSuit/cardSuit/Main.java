package cardSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String cardSuits = scan.nextLine();

        System.out.println(cardSuits + ":");

        for (CardSuit card : CardSuit.values()) {
            System.out.println(String.format("Ordinal value: %d; Name value: %s", card.ordinal(), card.name()));
        }
    }
}
