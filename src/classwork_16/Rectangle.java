package classwork_16;

public class Rectangle {
	double width;
	double height;
	
	double area() {
		return width * height;
	}
	
	double perimeter() {
		return 2 * (height + width);
	}
	
	void isSquare() {
		if(width == height) {
			boolean b = true;
			System.out.println("True");
		}else {
			boolean b = false;
			System.out.println("False");
		}
	}
}
