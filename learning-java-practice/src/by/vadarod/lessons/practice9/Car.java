package by.vadarod.lessons.practice9;

//1. Создать функциональный интерфейс. В этом интерфейсе будет метод, который будет возвращать результат умножения двух чисел.
//Наименование метода: Integer multiplication(int a, int b);
//2. В классе main используя ваш функциональный интерфейс, создате лямбда выражение и посчитайте произведение 5 на 10.
//3. Результат выведите в консоль.
//Задание №2
//1. Создать класс авто. Поля: id, марка, пробег, год выпуска, максимальная скорость, цена.
//1.1 Создать коллекцию из авто.
//1.2 Найти самую быструю машину.
//1.3 Найти самую медленную машину.
//1.4 Найти самую старую
//1.5 Найти самую новую
//1.6 Найти машины, у которых пробег от 50000 до 100000.
//1.7 Найти самую дорогую машину.
//1.8 Найти самую дешёвую машину.
//1.9 Отсортировать машины по пробегу (по возрастанию и по убыванию
//1.10 Отсортировать машины по стоимости (по возрастанию и по убыванию)
//1.11 Найти машины в диапазоне пробега от 20000 до 100000 и в диапазоне цен от 10000 до 20000.
//1.12 Получить не повторяющиеся значения марок авто (distinct).
//1.13 Найти машину в задданом дипазоне цен, определённой марки, с заданным дипазоном пробега, в заданном диапазон год выпуска. Если таких нет, выбросить своё исключение.
//
//Задание №3
//Создать задачу Callable, которая генерирует коллекцию из 10 рандомных целых чисел -> засыпает произвольно на 1-10 секунд, результат выполнения – сумму этих чисел в виде строки. Запустить 10 задач параллельно в пуле из 3 потоков. Вывести ход программы на экран с указанием имени потока, который выполняет работу.
//
//Задание№4
//1. Вывести в консоль текущую время и дату
//2. Выведите текущую дату в формате:
//26 ноября 2025
//3. Выведите текущую дату в формате 2025:11:2025T18:00:00

public class Car {
//1. Создать класс авто. Поля: id, марка, пробег, год выпуска, максимальная скорость, цена.
    int id;
    String brand;
    int mileage;
    int yearOfProdussing;
    int maxSpeed;
    int price;

    public Car(int id, int price, String brand, int mileage, int yearOfProdussing, int maxSpeed) {
        this.id = id;
        this.price = price;
        this.brand = brand;
        this.mileage = mileage;
        this.yearOfProdussing = yearOfProdussing;
        this.maxSpeed = maxSpeed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getYearOfProdussing() {
        return yearOfProdussing;
    }

    public void setYearOfProdussing(int yearOfProdussing) {
        this.yearOfProdussing = yearOfProdussing;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", mileage=" + mileage +
                ", yearOfProdussing=" + yearOfProdussing +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                '}';
    }
}
