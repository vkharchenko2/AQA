package lesson_4.payment;

public class Payment {
    private String transactionDate;
    private String transactionTime;
    private Good[] goods;

    public Payment(String transactionDate, String transactionTime, Good[] goods) {
        this.transactionDate = transactionDate;
        this.transactionTime = transactionTime;
        this.goods = goods;
    }

    public Payment() {

    }

    public void showInfo() {
        int sum = 0;
        for (Good good : goods) {
            sum += good.price;
        }
        String info = "Transaction Date: " + transactionDate +
                "\nTransaction Time: " + transactionTime +
                "\nTotal Price: " + sum;
        System.out.println(info);
        for (Good good : goods) {
            good.showInfo();
        }
    }

    public class Good {
        private String name;
        private int price;
        private String bestBefore;

        public Good(String name, int price, String bestBefore) {
            this.name = name;
            this.price = price;
            this.bestBefore = bestBefore;
        }

        public void showInfo() {
            String info = name + "\nPrice: " + price + "\nBest before: " + bestBefore;
            System.out.println(info);
        }
    }
}
