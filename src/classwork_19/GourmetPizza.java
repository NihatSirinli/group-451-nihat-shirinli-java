package classwork_19;

public class GourmetPizza extends Pizza {
    String extraIngredient;

    public GourmetPizza(String name, String size, double price, String extraIngredient) {
        super(name, size, price);
        this.extraIngredient = extraIngredient;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 50;
    }
}