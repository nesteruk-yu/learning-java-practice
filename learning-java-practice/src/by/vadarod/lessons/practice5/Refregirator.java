package by.vadarod.lessons.practice5;

//4. Создать класс Холодильник. Поля: наименование, марка, стоимость, Boolean isOn (включен). Класс холодильник имплементирует интерфейс Электроприборы. Переопределите метод work так, чтобы методы выводил «Холодильник морозит».

public class Refregirator implements Devices, KitchenDevices{
    private String name;
    private String mark;
    private int cost;
    private Boolean isOn;

    @Override
    public void work(){
        System.out.println("Холодильник морозит");
    }

    public Refregirator(String name, String mark, int cost){
        this.name = name;
        this.mark = mark;
        this.cost = cost;
    }

    @Override
    public void broke() {
        System.out.println("Холодильник ломается");
    }
}
