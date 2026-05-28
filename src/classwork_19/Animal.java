package classwork_19;

public class Animal {
     String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Животное издаёт звук");
    }
}
