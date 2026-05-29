package classwork_19;

public class Artwork {
    String title;
    String artist;
    int year;

    Artwork(String title, String artist, int year) {
        this.title = title;
        this.artist = artist;
        this.year = year;
    }
    
    void display() {
        System.out.print("Название: " + title + " Автор: " + artist + " Год: " + year);
    }
}
