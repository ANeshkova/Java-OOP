package cardRank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String cardRanks = scan.nextLine();

        System.out.println(cardRanks + ":");

        for (CardRank card : CardRank.values()) {
            System.out.println(String.format("Ordinal value: %d; Name value: %s", card.ordinal(), card.name()));
        }
    }
}
