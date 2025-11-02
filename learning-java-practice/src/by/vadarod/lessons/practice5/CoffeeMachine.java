package by.vadarod.lessons.practice5;

//3. Создать класс Кофемашина. Поля наименование. Список функционала. Стоимость, Boolean isOn (включен) Класс кофемашина имплементирует интерфейс Электроприборы. Переопределите метод ворк так, чтобы методы выводил «Кофемашина варит кофе».

public class CoffeeMachine implements Devices {
    private String name;
    private String function;
    private int price;
    private boolean isOn;

    @Override
    public void work() {
        System.out.println("Кофемашина варит кофе");
    }

    public CoffeeMachine(String name, String function, int price, boolean isOn) {
        this.name = name;
        this.function = function;
        this.price = price;
        this.isOn = isOn;
    }

    public void start() {
        this.isOn = true;
        System.out.println("isOn: " + this.isOn);
    }
}
