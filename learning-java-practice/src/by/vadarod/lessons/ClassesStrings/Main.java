package by.vadarod.lessons.ClassesStrings;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book(8, "Romeo & Julietta", "Shekspier", "NeZnayu", 1827, 234, 34);
        book1.info();

        book1.changePrice(89);
        book1.info();

// 4. В классе main создать массив из пяти книг
        Book books[] = {
                new Book(1, "Name Book 1", "Gogol", "Vesna", 1879, 374, 43),
                new Book(2, "Name Book 2", "Mogol", "Leto", 1789, 374, 5),
                new Book(3, "Name Book 3", "Tolstoy", "Solnce", 2021, 374, 988),
                new Book(4, "Name Book 4", "Hudoy", "Zima", 1989, 374, 67),
                new Book(5, "Name Book 5", "Veseluy", "Luna", 1865, 374, 44),
        };

        for (Book book : book1.showEstablish(books, 1956)) {
            if (book == null) {
                continue;
            }
            book.info();
        }

//2. Распечатать последний символ строки. Используем метод String.charAt().
        String str1 = "Name Book";
        System.out.println(str1.charAt(str1.length() - 1));

//3. Проверить, заканчивается ли ваша строка подстрокой “java!”. Используем метод String.endsWith().
        String str2 = "Name Book Java!";
        String str3 = "java!";

        if (str2.endsWith(str3)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

//10. Вырезать строку Java c помощью метода String.substring().
        String str4 = "I like Java!!!";
        System.out.println(str4.substring(0, 7) + str4.substring(11));
    }
}
