package classwork_19;

public class GameCharacter {
	String name;
	int health;
	
	public GameCharacter(String name, int health) {
		this.name = name;
		this.health = health;
	}
	
    void attack() {
        System.out.println(name + ": атака на 10");
    }
    
    void takeDamage(int amount) {
        health -= amount;
        System.out.println(name + " получил " + amount + " урона. Осталось здоровья: " + health);
    }
}
