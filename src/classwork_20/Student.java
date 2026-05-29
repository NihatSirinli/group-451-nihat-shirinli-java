package classwork_20;

public class Student extends Person{
    int studentId;
	Student(String name, int age, int studentId) {
		super(name, age);
		 this.studentId = studentId;
	}
	
    void study() {
        System.out.println(name + " is studying.");
    }
    
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println(" Student ID: " + studentId);
    }
}
