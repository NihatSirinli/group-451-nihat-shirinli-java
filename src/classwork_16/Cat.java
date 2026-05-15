package classwork_16;

public class Cat extends Animal {
    public Cat(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
    public void makeSound() {
        System.out.println("Мяу!");
    }
}