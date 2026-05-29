package classwork_20;

public abstract class SmartDevice {
    String brand;
    SmartDevice(String brand) { this.brand = brand; }
    abstract void powerOn();
}