package classwork_19;

public class ElectronicToy extends Toy {
    private boolean batteryRequired;

    public ElectronicToy(String name, double price, boolean batteryRequired) {
        super(name, price); 
        this.batteryRequired = batteryRequired;
    }

    @Override
    public String getInfo() {
        String batteryInfo = batteryRequired ? "Да" : "Нет";
        return super.getInfo() + ", Нужны батарейки: " + batteryInfo;
    }

    public void displayDetails() {
        System.out.println(getInfo());
    }
}
