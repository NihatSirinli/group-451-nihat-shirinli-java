package classwork_10;

public class Employee {
	    String name;
	    String position;
	    double salary;   
	    
	    Employee(String name, String position, double salary) {
	        this.name = name;
	        this.position = position;
	        this.salary = salary;
	    }
	    
	    void increaseSalary(double percent) {
	        salary += salary * percent / 100;
	    }
	    
	    void displayInfo() {
	        System.out.println("Имя: " + name);
	        System.out.println("Должность: " + position);
	        System.out.println("Зарплата: " + salary);
	    }
}
