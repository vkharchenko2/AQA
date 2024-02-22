import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringJoiner;
import java.util.stream.IntStream;

public class AppDataMethods {

    private static final String DELIMITER = ";";
    private static final String LINE_BREAK = "\n";

    public static void save(AppData data, String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(String.join(DELIMITER, data.getHeader()));
            writer.write(LINE_BREAK);

            for (int[] row : data.getData()) {
                StringJoiner stringJoiner = new StringJoiner(DELIMITER);
                IntStream.of(row).forEach(x -> stringJoiner.add(String.valueOf(x)));
                writer.write(stringJoiner.toString());
                writer.write(LINE_BREAK);
            }
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static AppData load(String filePath) {
        AppData appData = new AppData();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String headerLine = reader.readLine();
            String[] header = headerLine.split(DELIMITER);
            appData.setHeader(header);
            String line;
            int[][] dataArray = new int[header.length][header.length];
            int rowIndex = 0;
            while (((line = reader.readLine()) != null)) {
                String[] values = line.split(DELIMITER);
                int[] row = new int[values.length];
                for (int i = 0; i < values.length; i++) {
                    row[i] = Integer.parseInt(values[i]);
                }
                dataArray[rowIndex] = row;
                rowIndex++;
            }
            appData.setData(dataArray);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return appData;
    }
}
