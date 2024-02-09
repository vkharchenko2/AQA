package lesson_4.animals;

public class Plate {
    private int food;

    public int getFood(){
        return food;
    }

    public void addFood(int quantity){
        food += quantity;
    }

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int quantity) {
        food -= quantity;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}
