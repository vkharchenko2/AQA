package lesson_4;

import lesson_4.animals.Cat;
import lesson_4.animals.Plate;
import lesson_4.park.Park;
import lesson_4.payment.Payment;

public class Main {

    public static void main(String[] args) {
        Plate plate = new Plate(10);
        Cat[] cats = {new Cat("Феликс", 5), new Cat("Филя", 8)};
        for (Cat cat : cats) {
            cat.eat(plate);
            cat.hungerInfo();
        }

        Park.Attraction[] attractions = {
                new Park().new Attraction(10, 100, "Every 10 minutes", "The Star"),
                new Park().new Attraction(16, 200, "Every 7 minutes", "Dead End")};
        Park park = new Park("10am - 6pm", " Gagarin Street 27", "RedStar.com", attractions);
        park.showInfo();

        Payment.Good[] goods = {
                new Payment().new Good("Bread", 2, "20.06.2024"),
                new Payment().new Good("Rice", 4, "11.09.2026"),
                new Payment().new Good("Tomatoes", 10, "20.03.2024")};

        Payment payment = new Payment("15.03.2024", "15:32", goods);
        payment.showInfo();

    }
}
