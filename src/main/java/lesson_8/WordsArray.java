package lesson_8;

import java.util.*;

public class WordsArray {

    public static void wordsArray(String[] arrayOfWords) {
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String uniqueWord : arrayOfWords) {
            if (wordCount.containsKey(uniqueWord)) {
                wordCount.put(uniqueWord, wordCount.get(uniqueWord) + 1);
            } else {
                wordCount.put(uniqueWord, 1);
            }
        }
        System.out.println("Unique words:");
        for (String word : wordCount.keySet()) {
            System.out.println(word);
        }
        System.out.println("\nNumber of words:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
