package classwork_17;

public class Student {
    String name;
    int age;
    double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    void displayInfo() {
        System.out.println("Студент: " + name + ", Возраст: " + age + ", Оценка: " + grade);
    }
}
