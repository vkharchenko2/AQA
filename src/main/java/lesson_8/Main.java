package lesson_8;

public class Main {

    public static void main(String[] args) {
        String[] arrayOfWords =
                {"cat", "dolphin", "cat", "dog", "dog",
                        "pig", "hamster", "cat", "chicken",
                        "chicken", "whale", "cockroach"};
        WordsArray.wordsArray(arrayOfWords);

        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();
        telephoneDirectory.add("Petrenko", "066 245 907");
        telephoneDirectory.add("Beroshvili", "673 094 731");
        telephoneDirectory.add("Kowalski", "891 567 249");
        telephoneDirectory.add("Petrenko", "095 173 024");
        System.out.println("Petrenko's phone number: " + telephoneDirectory.get("Petrenko"));
        System.out.println("Kowalski's phone number: " + telephoneDirectory.get("Kowalski"));
        System.out.println("Ivanov phone number: " + telephoneDirectory.get("Ivanov"));
    }
}
