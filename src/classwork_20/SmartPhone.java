package classwork_20;

public class SmartPhone extends SmartDevice{
    String os;

    SmartPhone(String brand, String os) {
        super(brand);
        this.os = os;
    }

    @Override
    void powerOn() {
        System.out.println(brand + " " + os + " booting...");
    }
}
