package classwork_7;

public class Person {
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name; this.age =age; 
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age; 
	}
	
	
	public void introduce() {
		System.out.println("Привет, меня зовут " + name + " и мне "+ age + " лет");
	}
}
