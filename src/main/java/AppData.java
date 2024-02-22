import java.util.Arrays;

public class AppData {

    private String[] header;
    private int[][] data;

    public AppData() {
    }

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public String[] getHeader() {
        return header;
    }

    public int[][] getData() {
        return data;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("AppData{" +
                "headers=" + Arrays.toString(header) +
                ", data=");
        for (int[] i : data) {
            stringBuilder.append(Arrays.toString(i));
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
