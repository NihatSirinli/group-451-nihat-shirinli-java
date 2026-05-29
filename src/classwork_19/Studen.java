package classwork_19;

public class Studen extends Person{
    int grade;

	Studen(String name, int age, int grade) {
		super(name, age);
		this.grade = grade;
		// TODO Auto-generated constructor stub
	}
	
	
    @Override
    void introduce() {
        System.out.println("Привет! Я " + name + " из " + grade + "-го класса. Мне " + age + " лет.");
    }

    void study() {
        System.out.println("Ученик " + name + " учится в " + grade + " классе.");
    }
}
