
public class Armor extends Item {
	private int AC;
	
	public Armor(String name, String description, int type, Actor owner, int AC) {
		super(name, description, type, owner);
		this.setAC(AC);
		// TODO Auto-generated constructor stub
	}

	public int getAC() {
		return AC;
	}

	public void setAC(int AC) {
		this.AC = AC;
	}
}
