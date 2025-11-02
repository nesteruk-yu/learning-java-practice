package by.vadarod.lessons.practice5;

//7. В классе main cоздайте по паре объектов на основании вышесозданных классов. Создайте в классе main создайте выставку из электроприбров и продемонстрируйте способности каждого электроприбора

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine1 = new CoffeeMachine("Delongi", "Кофе+сливки", 1500, false);
        CoffeeMachine coffeeMachine2 = new CoffeeMachine("Mekka", "Кокосовый раф на альтернативном молоке", 3400, true);

        Refregirator refregirator1 = new Refregirator("Atlant", "f45pro", 8990);
        Refregirator refregirator2 = new Refregirator("Bosh", "A98proMax", 19290);

        Vacuum vacuum1 = new Vacuum("vacuum1", "Panasonic", 2200, false);
        Vacuum vacuum2 = new Vacuum("vacuum2", "Bosh", 5200, true);

        WashingMachine washingMachine1 = new WashingMachine("стиралка1", "LG", 4599, false);
        WashingMachine washingMachine2 = new WashingMachine("стиралка1", "Electrolux", 6100, true);

        Devices[] exhibition = {coffeeMachine1, coffeeMachine2, refregirator1, refregirator2, vacuum1, vacuum2, washingMachine1, washingMachine2};
        for (Devices e : exhibition) {
            e.work();
        }

//  9.  В классе main сделать выставку только из Кухонной техники. Продемонстрировать спосбоности всех электроприборов в этой выставке.

        KitchenDevices [] kitchenExhibition = {refregirator1, refregirator2, washingMachine1, washingMachine2};
        for (KitchenDevices i : kitchenExhibition) {
            i.broke();
        }

//  10. В классе main сделать выставку кофемашин. Продемонстрировать способности всех кофе машин.

        CoffeeMachine [] coffeeMachine = {coffeeMachine1, coffeeMachine2};
        for (CoffeeMachine c : coffeeMachine) {
            c.work();
        }

//  11. На любой кофемашине вызовете метод start(). После этого переопределите метод start так, чтобы этот метод включал прибор (менял значение Boolean isOn на true.) Выведите результат в консоль

        coffeeMachine1.start();

    }
}
