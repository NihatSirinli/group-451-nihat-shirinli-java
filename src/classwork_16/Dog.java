package classwork_16;

public class Dog {
	String name = "Albert";
	String breed = "Einshtein pitbull";
	int age = 79;
	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	public void bark() {
		System.out.println("Haw haw");
	}
	
	public void introduce() {
		System.out.println("My name is: " + name + " my breed is: " + breed + "and I am " + age + "years old");
	}
}