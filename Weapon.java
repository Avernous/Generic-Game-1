
public class Weapon extends Item {
	private int damage;
	
	public Weapon(String name, String description, int type, Actor owner, int damage) {
		super(name, description, type, owner);
		this.setDamage(damage);
		// TODO Auto-generated constructor stub
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	} 
}
