package classwork_16;

public class Bird extends Animal {
    public Bird(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	boolean canFly;

    @Override
    public void makeSound() {
        System.out.println("Чирик!");
    }
}