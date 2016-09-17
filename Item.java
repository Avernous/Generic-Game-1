
public class Item {
	private String name;
	private String description;
	private int type; // weapon, armor, consumable
	private Actor owner;
	
	
	public Item(String name, String description, int type, Actor owner){
		this.name = name;
		this.description = description;
		this.type = type;
		this.owner = owner;
	}


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}



	public int getType() {
		return type;
	}



	public void setType(int type) {
		this.type = type;
	}



	public Actor getOwner() {
		return owner;
	}



	public void setOwner(Actor owner) {
		this.owner = owner;
	}
	
}
