package by.vadarod.lessons.practice4;

//1.3 Создать класс Промышленном здание (IndustrialBuilding). Промышленные здания наследуются от Постройки. Поля которые можно определить в Промышленном здании: отрасль (Отрасль в которой здание задействовано (машиностроительная, легкая промышленность, целлюлозная промышленность, сельское хозяйство)

public class IndustrialBuilding extends Building {
    private String industry;

    public IndustrialBuilding(String street, String material, int year, String industry) {
        super(street, material, year);
    }

    public String info() {
        String info = "отрасль" + industry;
    }

    public String getIndustry() {
        return industry;
    }
}

