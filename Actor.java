import java.util.ArrayList;

/**
 * @author: Isaiah Lee
 * 
 */

public class Actor {
	
	private boolean player;
	private int hp;
	private int armor;
	private ArrayList<Item> inventory;
	private String name;
	
	public Actor(){
		
	}
	
	public Actor(boolean player, int hp, int armor, ArrayList<Item> inventory, String name){
		this.player = player;
		this.hp = hp;
		this.armor = armor;
		this.inventory = inventory;
		this.name = name;
	}

	public boolean isPlayer() {
		return player;
	}

	public void setPlayer(boolean player) {
		this.player = player;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public ArrayList <Item> getInventory() {
		return inventory;
	}

	public void setInventory(ArrayList <Item> inventory) {
		this.inventory = inventory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
