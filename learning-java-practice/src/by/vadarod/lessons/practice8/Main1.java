package by.vadarod.lessons.practice8;

//Дан русский текст: Сериализация объектов - это процесс сохранения состояния объектов в виде последовательности байтов, а также процесс восстановления в дальнейшем из этих байтов "живых" объектов. Java Serialization API предоставляет разработчикам Java стандартный механизм управления сериализацией объектов. API мал и легок в применении, а его классы и методы просты для понимания.
//        Использовать Reader, Writer
//1. Записать его в файл прописал относительный путь.
//2. Записать его в файл прописав абсолютный путь.
//3. Вычитать текст из первого файла.
//4. Вычитать текст из второго файла
//5. Создать объект Ферма с полями. Выполнить сериализацию и десериализацию в файл. (интерфейс Externelizibel)

import java.io.*;
import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        first();
        second();
        third();
        first();
    }

    public static void first() {
        File file = new File("File.text");

        try (FileWriter fileWriter = new FileWriter(file)) {

            fileWriter.write("Сериализация объектов - это процесс сохранения состояния объектов в виде последовательности байтов, а также процесс восстановления в дальнейшем из этих байтов \"живых\" объектов. Java Serialization API предоставляет разработчикам Java стандартный механизм управления сериализацией объектов. API мал и легок в применении, а его классы и методы просты для понимания.");
        } catch (IOException e) {
            System.out.println("рандомный текст");
        }
    }

    public static void second() {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("File.text");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println(bufferedReader);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void third() {
        Ferma ferma1 = new Ferma("Ferma1", 10);
        Ferma ferma2 = new Ferma("Ferma2", 15);

        ArrayList<Ferma> fermas = new ArrayList<>();
        fermas.add(ferma1);
        fermas.add(ferma2);

        try {
            FileOutputStream fos = new FileOutputStream("FileSerialized");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
            objectOutputStream.writeObject(ferma1);
            objectOutputStream.writeObject(ferma2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void fourth() {

        try{
        FileInputStream fis = new FileInputStream("FileSerialized");
        ObjectInputStream objectInputStream = new ObjectInputStream(fis);
            System.out.println(objectInputStream.readObject());
    } catch (IOException e) {
            throw new RuntimeException(e);
        }
}
