package telephony;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] numbers = scan.nextLine().split("\\s+");
        List<String> allNumbers = new ArrayList<>(Arrays.asList(numbers));

        String[] urls = scan.nextLine().split("\\s+");
        List<String> allUrls = new ArrayList<>(Arrays.asList(urls));

        Smartphone smartphone = new Smartphone(allNumbers, allUrls);

        System.out.println(smartphone.call());
        System.out.println(smartphone.browse());
    }
}
