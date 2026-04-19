package classswork_11;

public class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("Meow!");
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        a.speak();

        Cat c = new Cat();
        c.speak();
    }
}
