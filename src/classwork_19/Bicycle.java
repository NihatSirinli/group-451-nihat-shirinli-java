package classwork_19;

public class Bicycle extends Vehicle {

	public Bicycle(int speed, int fuel) {
		super(speed, fuel);
		// TODO Auto-generated constructor stub
	}
	
    @Override
    public void move() {
        System.out.println("велосипед крутит педали");
    }
}
