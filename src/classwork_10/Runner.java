package classwork_10;

public class Runner {
	public static void main(String[] args) {
		Car car = new Car();
		
		car.brand = "BMW";
		car.model = "M5 F90";
		car.year = 2017;
        System.out.println("Марка: " + car.brand);
        System.out.println("Модель: " + car.model);
        System.out.println("Год: " + car.year);
        
        
        
        Student s1 = new Student();
        s1.name = "Alex";
        s1.age = 18;
        s1.grade = 90;
        
        Student s2 = new Student();
        s2.name = "David";
        s2.age = 19;
        s2.grade = 95;
        
        
        System.out.println("Студент 1:");
        System.out.println("Имя: " + s1.name);
        System.out.println("Возраст: " + s1.age);
        System.out.println("Оценка: " + s1.grade);

        System.out.println("---------------");

        System.out.println("Студент 2:");
        System.out.println("Имя: " + s2.name);
        System.out.println("Возраст: " + s2.age);
        System.out.println("Оценка: " + s2.grade);
        
        
        
        
        Rectangle rect = new Rectangle();

        rect.width = 5;
        rect.height = 3;

        System.out.println("Площадь: " + rect.getArea());
	}
}
