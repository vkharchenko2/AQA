package lesson_5.fruit;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private final ArrayList<T> fruit = new ArrayList<>();

    public boolean compare(Box<? extends Fruit> another) {
        return this.getFruitWeight() == another.getFruitWeight();
    }

    public void transferFruit(Box<T> another) {
        another.addFruit(fruit);
        fruit.clear();
    }

    public void addFruit(ArrayList<T> fruit) {
        this.fruit.addAll(fruit);
    }

    public void addFruit(T fruit) {
        this.fruit.add(fruit);
    }

    public float getFruitWeight() {
        float fruitWeight;
        if (fruit.size() == 0) {
            fruitWeight = 0.0f;
        } else {
            if (fruit.get(0) instanceof Apple) {
                fruitWeight = fruit.size() * Apple.WEIGHT_OF_APPLE;
            } else if (fruit.get(0) instanceof Orange){
                fruitWeight = fruit.size() * Orange.WEIGHT_OF_ORANGE;
            } else {
                fruitWeight = 0.0f;
                System.out.println("Фрукт не найден");
            }
        }
        return fruitWeight;
    }
}
