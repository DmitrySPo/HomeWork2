import java.util.*;

public class PhoneBook {

    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String surname, String number) {
        if (!phoneBook.containsKey(surname)) {
            phoneBook.put(surname, new ArrayList<>());
        }
        phoneBook.get(surname).add(number);
    }

    public List<String> get(String surname) {
        return phoneBook.get(surname);
    }

}
