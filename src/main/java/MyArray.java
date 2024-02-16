public class MyArray {

    private static final int SIZE_VALUE = 4;
    private static final String THE_INPUT_IS_AN_ARRAY_OF_S_ELEMENTS =
            "Expected array size: 4:4. The input is an array of %s elements";
    private static final String ARRAY_NUMBER_S_HAS_S_ELEMENTS =
            "Expected array size: 4:4. Array number %s has %s elements";
    private static final String COULDN_T_PARSE = "Error in the cell %s : %s. Couldn't parse \"%s\"";

    public static void myArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != SIZE_VALUE) {
            throw new MyArraySizeException(String.format(THE_INPUT_IS_AN_ARRAY_OF_S_ELEMENTS, array.length));
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != SIZE_VALUE) {
                throw new MyArraySizeException(String.format(ARRAY_NUMBER_S_HAS_S_ELEMENTS, i, array[i].length));
            }
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                try {
                    int q = Integer.parseInt(array[i][j]);
                    sum += q;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(
                            String.format(COULDN_T_PARSE, i, j, array[i][j]));
                }
            }
        }
        System.out.println(sum);
    }
}
