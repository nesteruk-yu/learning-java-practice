package by.vadarod.lessons.practice5;

//6. Создать класс Пылесос. Поля наименование, бренд, стоимость, Boolean isOn. Класс Пылесос имплементирует интерфейс Электроприборы. Переопределите метод ворк так, чтобы метод выводил «Пылесос убирает».

public class Vacuum implements Devices {
    private String name;
    private String brend;
    private int price;
    private Boolean isOn;

    @Override
    public void work(){
        System.out.println("Пылесос убирает");
    }

    public Vacuum(String name, String brend, int price, Boolean isOn) {
        this.name = name;
        this.brend = brend;
        this.price = price;
        this.isOn = isOn;
    }
}
