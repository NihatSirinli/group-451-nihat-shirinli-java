package classwork_10;

public class Book {
	String title;
	String author;
	int pages;
	
    Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    
    void displayInfo() {
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Страниц: " + pages);
    }
}
