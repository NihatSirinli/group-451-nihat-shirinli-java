package classwork_20;

public class Circle extends Shape{
    double r;
    Circle(double r) { this.r = r; }
    // implement area() -> PI * r * r
	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.PI * r * r;
	}
}
