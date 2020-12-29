package rhombusOfStars;

import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= num; i++) {
            printSpaces(num, i);
            printStars(i);
            System.out.println();
        }

        for (int i = num - 1; i >= 1; i--) {
            printSpaces(num, i);
            printStars(i);
            System.out.println();
        }
    }

    private static void printSpaces(int num, int i) {
        for (int spaces = 0; spaces < num - i; spaces++) {
            System.out.print(" ");
        }
    }

    private static void printStars(int i) {
        for (int stars = 1; stars <= i; stars++) {
            System.out.print("* ");
        }
    }
}
