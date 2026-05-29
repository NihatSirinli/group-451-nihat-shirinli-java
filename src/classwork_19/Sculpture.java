package classwork_19;

public class Sculpture extends Artwork{
    String material;
    Sculpture(String title, String artist, int year, String material) {
        super(title, artist, year);
        this.material = material;
    }
    
    @Override
    void display() {
        System.out.println("Название: " + title + ", Автор: " + artist + ", Год: " + year + ", Материал: " + material);
    }
}
