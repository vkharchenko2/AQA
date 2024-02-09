package lesson_4.animals;

public class Dog extends Animal implements Runnable, Swimmable {

    private static int countDog = 0;
    private static final int RUN_LIMIT = 200;
    private static final int SWIM_LIMIT = 50;

    public Dog(String name) {
        super();
        countDog++;
        this.name = name;
    }

    public static int getCountDog() {
        return countDog;
    }

    @Override
    public void swim(int range) {
        if (range > SWIM_LIMIT) {
            System.out.println(name + " не может плыть дальше " + SWIM_LIMIT + " м");
        } else {
            System.out.println(name + " проплыл " + range + " м");
        }
    }

    @Override
    public void run(int range) {
        if (range > RUN_LIMIT) {
            System.out.println(name + " не может бежать дальше " + RUN_LIMIT + " м");
        } else {
            System.out.println(name + " пробежал " + range + " м");
        }
    }
}
