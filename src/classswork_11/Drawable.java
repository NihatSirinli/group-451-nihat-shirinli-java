package classswork_11;

public class Drawable {
    int radius;

    void Drawbale(int radius) {
        this.radius = radius;
    }

    void draw() {
        System.out.println("Circle radius: " + radius);
    }
}

class Rectangle {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    void draw() {
        System.out.println("Rectangle width: " + width + ", height: " + height);
    }
}
