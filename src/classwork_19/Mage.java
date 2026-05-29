package classwork_19;

public class Mage extends GameCharacter {

	public Mage(String name, int health, int mana) {
		super(name, health);
		this.mana = mana;
		// TODO Auto-generated constructor stub
	}
	
    int mana;
    
    @Override
    void attack() {
        super.attack();
        System.out.println(name + " применяет магию: урон 25");
    }

    void castSpell() {
        if (mana >= 10) {
            mana -= 10;
            System.out.println(name + " сотворил заклинание, Оставшаяся мана: " + mana);
        } else {
            System.out.println(name + ": недостаточно маны");
        }
    }
}
