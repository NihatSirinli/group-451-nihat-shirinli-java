package classwork_20;

public class Cube extends ThreeDShape{
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double volume() {
        return Math.pow(side, 3);
    }

    @Override
    public String toString() {
        return String.format("Cube with volume: %.2f", volume());
    }
}
