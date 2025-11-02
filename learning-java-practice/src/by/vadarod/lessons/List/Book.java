package by.vadarod.lessons.List;

//3. Условие: Создай класс Book с полями:
// String title
// String author

import java.util.Objects;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

//3.2 Переоперделите метод equals на книгах так,чтобы он всегда возвращал false

    @Override
    public boolean equals(Object o) {
        Book book = (Book) o;
        if (title.equals(book.getTitle())) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(title);
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + '}';
    }
}
