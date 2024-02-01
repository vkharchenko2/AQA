package lesson_2;

public class LeapYear {

    // Задание 4*. Написать метод, который определяет,
    // является ли год високосным, и возвращает boolean (високосный - true, не високосный - false).
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static boolean isYearLeap(int year) {
        boolean isYearLeap = false;
        if (year < 1584) {
            return isYearLeap;
        }
        if ((year % 4 == 0 && year % 100 != 0) | (year % 400 == 0)) {
            isYearLeap = true;
        }
        return isYearLeap;
    }
}
