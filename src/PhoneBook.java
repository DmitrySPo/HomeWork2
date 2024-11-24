import java.util.ArrayList;
import java.util.HashMap;

public class PhoneDirectory {
    private HashMap<String, ArrayList<String>> phoneBook;

    // Конструктор
    public PhoneDirectory() {
        phoneBook = new HashMap<String, ArrayList<String>>();
    }

    // Добавить запись
    public void add(String name, String number) {
        phoneBook.put(name, number);
    }

    // Получить запись
    public int get(String name) {
        return phoneBook.get(name);
    }
}

