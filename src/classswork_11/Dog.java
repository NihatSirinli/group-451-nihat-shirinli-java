package classswork_11;

public class Dog {
    String name;
    int age;
    
    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void bark() {
        System.out.println("Woof I'm " + name + "Woof Woof");
    }
}
