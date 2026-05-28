package classwork_19;

public class Book {
    String title;
    String author;
    boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public void borrow() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Вы взяли книгу: " + title);
        } else {
            System.out.println("Книга " + title + " уже занята.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("Вы вернули книгу: " + title);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
