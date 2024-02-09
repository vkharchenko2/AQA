package lesson_4.animals;

public class Cat extends Animal implements Runnable {
    private static int countCat = 0;
    private static final int RUN_LIMIT = 100;
    private int appetite;
    private boolean isFull = false;

    public Cat(String name, int appetite) {
        super();
        countCat++;
        this.name = name;
        this.appetite = appetite;
    }

    public static int getCountCat() {
        return countCat;
    }

    public void eat(Plate plate) {
        if (plate.getFood() - appetite >= 0) {
            plate.decreaseFood(appetite);
            isFull = true;
        } else {
            System.out.println("Коту по имени " + name + " не хватило еды");
        }
    }

    public void hungerInfo() {
        if (isFull) {
            System.out.println(name + " сыт");
        } else {
            System.out.println(name + " голоден");
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
