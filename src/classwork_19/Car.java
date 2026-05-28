package classwork_19;

public class Car extends Vehicle {

    public Car(int speed, int fuel) {
		super(speed, fuel);
		// TODO Auto-generated constructor stub
	}

	@Override
    public void move() {
        System.out.println("машина едет со скоростью " + speed);
    }
}