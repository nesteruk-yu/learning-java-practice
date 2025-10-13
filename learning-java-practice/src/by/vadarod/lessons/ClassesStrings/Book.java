package by.vadarod.lessons.ClassesStrings;

//1. Создать класс Book c полями id (тип int), name (тип String), author (тип String), издательство (тип String ), Год издания (тип Int), Количество старниц (тип int), цена (double).Инициализацию книги в классе main выполнять через конструктор с параметрами. Также определите конструктор без параметров.
public class Book {
    int id;
    String name;
    String author;
    String publisher;
    int establish;
    int pages;
    double price;

    public Book(int id, String name, String author, String publisher, int establish, int pages, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.establish = establish;
        this.pages = pages;
        this.price = price;
    }

    public Book(){
        this.id = 3;
        this.name = "Buratino";
        this.author = "Ne Pomnyu";
        this.publisher = "Toje Ne Pomnyu";
        this.establish = 1980;
        this.pages = 235;
        this.price = 45;
    }

//2. Создать метод, который будет выводить информацию по полям которые есть в классе и назвать его info
    public void info() {
        System.out.println("ID: " + this.id + ", Name: " + this.name + ", Author: " + this.author + ", Publisher: " + this.publisher + ", Establish: " + this.establish + ", Pages: " + this.pages + ", Price: " + this.price);
    }
//3. Создать метод, который будет изменять цену книги (сам метод в качестве параметра будет принимать новую цену)
    public int changePrice(int price) {
        this.price = price;
        return price;
    }
//5. Создать метод в классе Book, который будет принимать массив книг и возвращать массив книг, у которых год издания ниже переданнго года в методе.
    public Book [] showEstablish(Book [] books, int establish){

        Book [] result = new Book[books.length];
        for (int i = 0; i < books.length; i++) {
            if (books[i].establish < establish) {
                result[i] = books[i];
            }
        }
        return result;
    }
}
