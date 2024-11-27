public class Main {
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();

        // Добавление записей
        book.add("Иванов", "+7 900 123-45-67");
        book.add("Петров", "+7 901 234-56-78");
        book.add("Иванов", "+7 902 345-67-89");
        book.add("Иванов", "+7 902 345-67-99");

        // Получение записей
        System.out.println("По фамилии Иванов в справочнике есть следующие телефоны: " + book.get("Иванов").toString());
        System.out.println("По фамилии Петров в справочнике есть следующие  телефоны: " + book.get("Петров").toString());
    }
}
