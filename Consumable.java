
public class Consumable extends Item {
	private int healing;
	private int hpAffected;
	
	public Consumable(String name, String description, int type, Actor owner, int healing, int hpAffected) {
		super(name, description, type, owner);
		this.healing = healing;
		this.hpAffected = hpAffected;
	}

	public int isHealing() {
		return healing;
	}

	public void setHealing(int healing) {
		this.healing = healing;
	}

	public int getHpAffected() {
		return hpAffected;
	}

	public void setHpAffected(int hpAffected) {
		this.hpAffected = hpAffected;
	}


}
