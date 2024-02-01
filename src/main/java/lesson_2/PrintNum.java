package lesson_2;

public class PrintNum {

    // Задание 2. Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.
    public static void printSign(int number) {
        String isPositive = (number >= 0) ? "положительное" : "отрицательное";
        System.out.println("Число " + isPositive);
    }
}
