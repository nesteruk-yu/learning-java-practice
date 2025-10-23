package by.vadarod.lessons.practice5;

//5. Создать класс Стиральная машина. Поля наименование, бренд, стоимость, Boolean isOn. Класс стиральная машина имплементирует интерфейс Электроприборы. Переопределите метод ворк так, чтобы метод выводил «Стиральная машина стирает».

public class WashingMachine implements Devices, KitchenDevices {
    private String name;
    private String brand;
    private int price;
    private Boolean isOn;

    @Override
    public void work() {
        System.out.println("Стиральная машина стирает");
    }

    public WashingMachine(String name, String brand, int price, Boolean isOn) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void broke() {
        System.out.println("Стиральная машина ломается");
    }
}
