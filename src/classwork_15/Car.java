package classwork_15;

public class Car {
    private String carModel;

    public Car(String carModel) {
        this.carModel = carModel;
    }

    public class Engine {
        public void start() {
            System.out.println("Engine started in " + carModel);
        }
    }
}