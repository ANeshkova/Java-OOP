package wildFarm.animal;

import wildFarm.food.Food;
import wildFarm.food.Meat;

public class Tiger extends Felime {

    public Tiger(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if (!(food instanceof Meat)) {
            throw new IllegalArgumentException(String.format("%ss are not eating that type of food!", this.getClass().getSimpleName()));
        }
        super.setFoodEaten(super.getFoodEaten() + food.getQuantity());
    }
}
