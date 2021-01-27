package cardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String rank = scan.nextLine();
        String suit = scan.nextLine();

        RankPower RP = RankPower.valueOf(rank);
        SuitPower SP = SuitPower.valueOf(suit);

        Card cardsPower = new Card(RP, SP);

        System.out.println(String.format("Card name: %s of %s; Card power: %d", rank, suit, cardsPower.getPower()));
    }
}
