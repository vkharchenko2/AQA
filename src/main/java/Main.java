public class Main {

    public static void main(String[] args) {
        String[][] secondArray = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "d"},
                {"1", "2", "3", "4"}};
        try {
            MyArray.myArray(secondArray);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }
}
