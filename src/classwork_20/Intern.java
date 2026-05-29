package classwork_20;

public class Intern extends Employee{
    Intern(String name, double baseSalary) {
        super(name, baseSalary);
    }
    @Override
    double calculateSalary() {
        return super.calculateSalary() / 2;
    }
}
