package shoppingSpree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Person> people = new LinkedHashMap<>();
        String[] input = scan.nextLine().split(";");

        for (String inputPerson : input) {
            String[] nameAndMoney = inputPerson.split("=");
            Person person = new Person(nameAndMoney[0], Double.parseDouble(nameAndMoney[1]));
            people.putIfAbsent(nameAndMoney[0], person);
        }

        Map<String, Product> products = new LinkedHashMap<>();
        input = scan.nextLine().split(";");

        for (String inputProduct : input) {
            String[] nameAndCost = inputProduct.split("=");
            Product product = new Product(nameAndCost[0], Double.parseDouble(nameAndCost[1]));
            products.putIfAbsent(nameAndCost[0], product);
        }

        String command = scan.nextLine();

        while (!"END".equals(command)) {
            String[] tokens = command.split(" ");
            String personName = tokens[0];
            String productName = tokens[1];

            if (people.containsKey(personName) && products.containsKey(productName)) {
                Person person = people.get(personName);
                Product product = products.get(productName);

                try {
                    person.buyProduct(product);
                    System.out.println(person.getName() + " bought " + product.getName());
                } catch (IllegalStateException e) {
                    System.out.println(e.getMessage());
                }
            }

            command = scan.nextLine();
        }

        for (Person person : people.values()) {
            System.out.println(person);
        }
    }
}
