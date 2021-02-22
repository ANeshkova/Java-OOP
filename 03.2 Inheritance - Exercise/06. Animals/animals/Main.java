package animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Animal> animals = new ArrayList<>();

        String type = scan.nextLine();

        while (!"Beast!".equals(type)) {
            String[] tokens = scan.nextLine().split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            String gender = tokens[2];

            try {
                Animal animal = Animal.createAnimal(type, name, age, gender);
                animals.add(animal);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }


            type = scan.nextLine();
        }

        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
