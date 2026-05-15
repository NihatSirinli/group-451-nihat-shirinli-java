package classwork_16;

public class GameCharacter {
    String name;
    int health;
    int level;

    public GameCharacter(String name) {
        this.name = name;
        this.health = 100;
        this.level = 1;
    }

    public void takeDamage(int damage) {
        this.health = Math.max(0, this.health - damage);
    }

    public void heal(int amount) {
        this.health = Math.min(100, this.health + amount);
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public void levelUp() {
    	this.level += 1;
    }
}