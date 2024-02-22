public class Main {
    public static void main(String[] args) {
        String[] headers = {"value1", "value2"};
        int[][] values = {{2, 5}, {5, 8}};
        AppData a = new AppData(headers,values);
        AppDataMethods.save(a, "qwerty.csv");
        AppData b = AppDataMethods.load("qwerty.csv");
        System.out.println(b);
    }
}
