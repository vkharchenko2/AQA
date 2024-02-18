package lesson_8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelephoneDirectory {

    public Map<String, List<String>> directory = new HashMap<>();

    public void add(String lastname, String num) {
        List<String> numbers = directory.getOrDefault(lastname, new ArrayList<>());
        numbers.add(num);
        directory.put(lastname, numbers);
    }

    public List<String> get(String lastname) {
        return directory.getOrDefault(lastname, new ArrayList<>());
    }
}
