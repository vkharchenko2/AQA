package lesson_5.array;

public class Array {

    public static <T> void swapElements(T[] array, int index1, int index2) {
        if (array.length > index1 && array.length > index2) {
            T temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        } else {
            System.out.println("Массив меньше указанных индексов");
        }
    }
}
