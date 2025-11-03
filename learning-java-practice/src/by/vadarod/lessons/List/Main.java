package by.vadarod.lessons.List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//1.1.Создать коллекцию List (реализация ArrayList). Типизация коллекции – String.

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
        task4();
    }

//1.2 Добавить  пару записей (Привет, Как дела, Праздник, Суфле)
//1.3 Вывести все записи.

    public static void task1() {
        List<String> words = new ArrayList<>();
        String string1 = new String("Привет");
        String string2 = new String("Как дела");
        String string3 = "Праздник";
        String string4 = "Суфле";

        words.add(string1);
        words.add(string2);
        words.add(string3);
        words.add(string4);

        for (String word : words) {
            System.out.println(word);
        }

//1.4 Проверить, содержит ли коллекция слово Конфета
//1.5 Посчитать количество элементов в коллекции

        System.out.println(words.contains("Конфета"));
        System.out.println("количество элементов в коллекции: " + words.size());
    }

//2. Условие: Создайте ArrayList<String> для хранения списка покупок. Добавь в него 5 товаров.
// Затем выведите весь список на экран, а после — удалите один товар по названию и снова выведите обновлённый список.

    public static void task2() {
        List<String> purchaches = new ArrayList<>();

        String purchache1 = "Tkani";
        String purchache2 = "Moloko";
        String purchache3 = "Vino";
        String purchache4 = "Voda";
        String purchache5 = "Vodka";

        purchaches.add(purchache1);
        purchaches.add(purchache2);
        purchaches.add(purchache3);
        purchaches.add(purchache4);
        purchaches.add(purchache5);

        printList(purchaches);
        purchaches.remove("Voda");
        System.out.println("Список после удаления: ");
        printList(purchaches);

    }

    public static void printList(List<String> purchaches) {
        for (String purch : purchaches) {
            System.out.println(purch);
        }
    }

//3.1. Создайте 3 книги. И добавьте эти книги в коллекцию. Используйте метод List.of();
//3.3. Удалите 1 книгу из коллекции. Выведите все книги и проанализируйте результат.

    public static void task3() {

        Book book1 = new Book("Преступление", "Достоевский");
        Book book2 = new Book("Наказание", "Тоже Достоевский");
        Book book3 = new Book("Книга", "Автор");

        List<Book> books = new ArrayList<>();

        books.add(book1);
        books.add(book2);
        books.add(book3);

        books.remove(book1);

        for (Book book : books) {
            System.out.println(book);
        }

    }

//8. Условие: Создай класс Book с полями:
//• String title
//• String author
//Создайте множество Set<Book> и добавьте в него несколько книг, включая дубликаты (одинаковое название и автор). Переопределите методы equals() и hashCode() так, чтобы книги с одинаковыми значениями title и author считались одинаковыми. Выведи содержимое множества и убедись, что дубликаты не добавляются.

    public static void task4() {

        Book book1 = new Book("Книга", "Достоевский");
        Book book2 = new Book("Наказание", "Тоже Достоевский");
        Book book3 = new Book("Винни Пух", "Автор");
        Book book4 = new Book("Книга", "Автор");

        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
