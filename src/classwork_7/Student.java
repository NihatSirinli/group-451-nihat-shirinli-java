package classwork_7;

public class Student extends Person {

	public Student(String name, int age) {
		super(name, age);
	}
	
	String major;
	
	public Student(String name, int age, String major) {
	super(name, age);
	
	this.major = major;
	}
	
	@Override

	public void introduce() {

	super.introduce();

	System.out.println("Я учусь на 5 можешь ладе не проверять ну хорошо сам захотел увидеть я учусь на " + major);

	}
}
