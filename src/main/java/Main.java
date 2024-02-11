import lesson_5.array.Array;
import lesson_5.fruit.Apple;
import lesson_5.fruit.Box;
import lesson_5.fruit.Orange;

public class Main {

    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();
        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(apple);
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(apple);
        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(orange);

        System.out.println(appleBox.getFruitWeight());
        System.out.println(appleBox1.getFruitWeight());
        appleBox.transferFruit(appleBox1);
        System.out.println(appleBox.getFruitWeight());
        System.out.println(appleBox1.getFruitWeight());
        System.out.println(appleBox.compare(orangeBox));

        String[] array = {"Hello", "Bye"};
        Array.swapElements(array, 0, 1);
        for (String a : array) {
            System.out.println(a);
        }
        Array.swapElements(array, 69, 949);
    }
}
