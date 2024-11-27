import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayOfWords {
    public static void main(String[] args) {
        //Создать массив с набором слов (10 слов, должны встречаться повторяющиеся)
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("orange");
        words.add("apple");
        words.add("strawberry");
        words.add("orange");
        words.add("apple");
        words.add("grapes");
        words.add("orange");
        words.add("watermelon");

        //Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем)
        List<String> uniqueWords = new ArrayList<>();
        for (String word : words) {
            if (!uniqueWords.contains(word)) {
                uniqueWords.add(word);
            }
        }
        System.out.println(uniqueWords);

        System.out.println("-----------------");

        // Посчитать сколько раз встречается каждое слово и вывести на экран слово и количество повторений
        for (int i = 0; i < uniqueWords.size(); i++) {
            System.out.println(uniqueWords.get(i) + " - " + Collections.frequency(words, uniqueWords.get(i)));

        }
    }
}


