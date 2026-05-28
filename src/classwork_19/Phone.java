package classwork_19;

public class Phone {
    String brand;
    String model;
    double batteryLife;
    
    public Phone(String brand, String model, double batteryLife) {
        this.brand = brand;
        this.model = model;
        this.batteryLife = batteryLife;
        
    }
    void call(int duration) {
        if (batteryLife >= duration / 10.0) {
            batteryLife -= duration / 10.0;
            System.out.println("Звонок... осталось " + batteryLife + "% заряда.");
        } else {
            System.out.println("Нет заряда!");
        }
    }
}
