package classwork_19;

public class Toy {
    String name;
    double price;

    public Toy(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getInfo() {
        return "Игрушка: " + name + ", Цена: " + price + " руб.";
    }
}
