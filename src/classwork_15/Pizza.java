package classwork_15;

public class Pizza {
    String size;
    String crust;
    String topping;
    
    public Pizza size(String size) {
        this.size = size;
        return this;
    }

    public Pizza crust(String crust) {
        this.crust = crust;
        return this;
    }

    public Pizza topping(String topping) {
        this.topping = topping;
        return this;
    }
}
