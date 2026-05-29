package classwork_20;

public class Laptop extends SmartDevice{
    int ramSize;

    Laptop(String brand, int ramSize) {
        super(brand);
        this.ramSize = ramSize;
    }

    @Override
    void powerOn() {
        System.out.println(brand + " loading OS");
    }
}
