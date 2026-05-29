package classwork_19;

public class Paintingg extends Artwork {
	 String paintType;
	Paintingg(String title, String artist, int year, String paintType) {
		super(title, artist, year);
		this.paintType = paintType;
	}

    @Override
    void display() {
        super.display();
        System.out.println(", Тип краски: " + paintType);
    }
}
