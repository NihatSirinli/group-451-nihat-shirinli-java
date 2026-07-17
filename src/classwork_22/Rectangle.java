package classwork_22;

public class Rectangle {
	double width;
	double height; 
	
	public Rectangle() {
		
	}
	
	public Rectangle(double width, double height) {
		this.height = height;
		this.width = width;
	}
	
	double getArea() {
		return width * height;
	}
	
	double getPerimeter() {
		return 2 * (width + height);
	}
	
	boolean isSquare() {
		return width == height;
	}
}
