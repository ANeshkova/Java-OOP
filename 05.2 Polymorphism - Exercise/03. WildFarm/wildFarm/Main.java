package wildFarm;

import wildFarm.animal.*;
import wildFarm.food.Food;
import wildFarm.food.Meat;
import wildFarm.food.Vegetable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] animalInput = reader.readLine().split("\\s+");

        List<Animal> animals = new ArrayList<>();

        while (!"End".equals(animalInput[0])) {
            String[] foodInput = reader.readLine().split("\\s+");

            Animal animal = null;

            switch (animalInput[0]) {
                case "Mouse":
                    animal = new Mouse(animalInput[0], animalInput[1], Double.parseDouble(animalInput[2]), animalInput[3]);
                    break;

                case "Zebra":
                    animal = new Zebra(animalInput[0], animalInput[1], Double.parseDouble(animalInput[2]), animalInput[3]);
                    break;

                case "Cat":
                    animal = new Cat(animalInput[0], animalInput[1], Double.parseDouble(animalInput[2]), animalInput[3], animalInput[4]);
                    break;

                case "Tiger":
                    animal = new Tiger(animalInput[0], animalInput[1], Double.parseDouble(animalInput[2]), animalInput[3]);
                    break;
            }

            Food food = null;

            switch (foodInput[0]) {
                case "Vegetable":
                    food = new Vegetable(Integer.parseInt(foodInput[1]));
                    break;

                case "Meat":
                    food = new Meat(Integer.parseInt(foodInput[1]));
                    break;
            }

            if (animal != null) {
                animal.makeSound();

                try {
                    animal.eat(food);
                } catch (IllegalArgumentException message) {
                    System.out.println(message.getMessage());
                }
            }

            animals.add(animal);
            animalInput = reader.readLine().split("\\s+");
        }

        animals.forEach(System.out::println);
    }
}
