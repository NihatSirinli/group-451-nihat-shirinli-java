package classwork_17;

public class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double area() {
        return width * height;
    }

    double perimeter() {
        return 2 * (width + height);
    }

    void displayParameters() {
        System.out.println("Прямоугольник [" + width + " x " + height + "] -> Площадь: " + area() + ", Периметр: " + perimeter());
    }
}
