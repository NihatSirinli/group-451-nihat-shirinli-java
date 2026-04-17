package classwork_10;

public class Circle {
    double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    double getArea() {
        return Math.PI * radius * radius;
    }
    
    double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
