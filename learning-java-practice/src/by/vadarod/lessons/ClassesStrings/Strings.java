package by.vadarod.lessons.ClassesStrings;

public class Strings {
    public static void main(String[] args) {
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
