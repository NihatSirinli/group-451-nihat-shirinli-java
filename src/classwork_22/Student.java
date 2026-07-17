package classwork_22;

public class Student {
	String name;
	int id;
	
	static int totalStudents;
	static int nextId = 1;
	
	public Student(String name) {
		this.name = name;
		this.id = nextId;
		nextId++;
		totalStudents++;
	}
	
	static int getTotalStudents() {
		return totalStudents;
	}
	
	void printInfo() {
		System.out.println("Id: " + id + " Name: " + name);
	}
}
