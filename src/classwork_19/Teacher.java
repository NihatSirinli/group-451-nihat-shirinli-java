package classwork_19;

public class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    void introduce() {
        System.out.println("Здравствуйте. Я преподаватель " + name + ". Мой возраст: " + age + ".");
    }

    void teach() {
        System.out.println("Учитель " + name + " объясняет тему по предмету: " + subject);
    }
}
