package classwork_16;

public class Book {
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = true;
    }

    public void borrow() {
        if (this.isAvailable) {
            this.isAvailable = false;
        } else {
            System.out.println("Книга уже занята");
        }
    }

    public void returnBook() {
        this.isAvailable = true;
    }

    public String getInfo() {
        return "Название: " + this.title + ", Автор: " + this.author + ", Год издания: " + this.year;
    }
}