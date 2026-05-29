package classwork_20;

public class Manager extends Employee {
	double bonus;
    Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }
    
    @Override
    double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
}
