package classwork_10;

public class Phone {
    String brand;
    String model;
    int batteryLevel;
    
    Phone(String brand, String model, int batteryLevel) {
        this.brand = brand;
        this.model = model;
        this.batteryLevel = batteryLevel;
    }
    
    void call(String number) {
        if (batteryLevel < 10) {
            System.out.println("Слишком мало заряда для звонка иди купи адаптер!");
        } else {
            System.out.println("Номер: " + number);
            batteryLevel -= 10;
        }
    }
    void charge() {
        batteryLevel = 100;
        System.out.println("Телефон полностью заряжен вытащи!");
    }
}
