package by.vadarod.lessons.practice4;

//1.1 Создать класс Постройка (Building). Поля у класса Постройка: улица, материал стен, год постройки.
public class Building {
    private String street;
    private String material;
    private int year;

    public Building(String street, String material, int year) {
        this.street = street;
        this.material = material;
        this.year = year;
    }
}
