package classwork_19;

public class Person {
    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void introduce() {
        System.out.println("Привет меня зовут " + name + " мне " + age + " лет");
    }
}
