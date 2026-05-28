package classwork_19;

public class Pizza {
    String name;
    String size;
    double price;

    public Pizza(String name, String size, double price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public void bake() {
        System.out.println("пицца выпекается");
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
