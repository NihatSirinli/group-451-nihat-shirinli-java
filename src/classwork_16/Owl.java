package classwork_16;

public class Owl extends Animal {
    public Owl(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
    public void makeSound() {
        System.out.println("Угу!");
    }

    public void hunt() {
        System.out.println("Охотится ночью");
    }
}