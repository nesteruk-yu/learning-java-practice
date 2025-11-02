package by.vadarod.lessons.practice4;

//1.6 Создать класс фабрика. Вопрос: От какого класса должна наследоваться Фабрика. Поля, которые можно определить в Фабрике: количество работников, выпускаемая продукция (запчасти, полиэтилен и т.д.)

public class Fabric extends IndustrialBuilding {
    private int workers;
    private String products;

    public Fabric(String street, String material, int year, String industry, int workers, String products) {
        super(street, material, year, industry);
        this.workers = workers;
        this.products = products;
    }
    public String Info(){
        String info = "количесво рабочих" + workers + " производимая продукция" + products + "отрасль" + getIndustry ;
    }
}
