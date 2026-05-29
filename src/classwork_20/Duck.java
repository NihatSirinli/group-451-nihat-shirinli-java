package classwork_20;

public class Duck extends Animal1 implements Flyable, Swimable {
    Duck(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Duck flaps wings");
    }

    @Override
    public void swim() {
        System.out.println("Duck paddles");
    }
}
