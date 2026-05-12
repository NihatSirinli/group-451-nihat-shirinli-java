package classwork_15;

public class Rectangle {
	int width = 2;
	int height = 2;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
    public Rectangle(int width) {
        this.width = width;
        this.height = width;
    }
    
    public double area() {
        return width * height;
    }
}
