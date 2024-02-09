package lesson_4.park;

public class Park {
    //Так как Park и Payment не относятся к животным (и заданиям с ними),
    // я решил создать отдельные пакеты с одним общим классом Main

    private String businessHours;
    private String address;
    private String webPage;
    private Attraction[] attractions;

    public Park(String businessHours, String address, String webPage, Attraction[] attractions) {
        this.businessHours = businessHours;
        this.address = address;
        this.webPage = webPage;
        this.attractions = attractions;
    }

    public Park() {

    }

    public void showInfo() {
        String info = "Business Hours: " + businessHours +
                "\nAddress: " + address +
                "\nWeb Page: " + webPage +
                "\nAttractions:";
        System.out.println(info);
        for (Attraction attraction : attractions) {
            attraction.showInfo();
        }
    }

    public class Attraction {

        private int minAge;
        private int price;
        private String launchTime;
        private String name;

        public Attraction(int minAge, int price, String launchTime, String name) {
            this.minAge = minAge;
            this.price = price;
            this.launchTime = launchTime;
            this.name = name;
        }

        public void showInfo() {
            String info = name + "\nPrice: " + price + "\nMinimal Age: " + minAge + "\nLaunch Time: " + launchTime;
            System.out.println(info);
        }
    }
}
