package lesson_4.animals;

public abstract class Animal {
    private static int countAnimal = 0;
    protected String name;


    public Animal() {
        countAnimal++;
    }

    public static int getCountAnimal() {
        return countAnimal;
    }
}
