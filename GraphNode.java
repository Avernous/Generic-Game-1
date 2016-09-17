public class GraphNode {

	private boolean isActorPresent;
	private int terrain; // grass, gravel
	
	
	public GraphNode(boolean isActorPresent, int terrain){
		this.isActorPresent = isActorPresent;
		this.terrain = terrain;
	}

	public boolean isActorPresent() {
		return isActorPresent;
	}

	public void setActorPresent(boolean isActorPresent) {
		this.isActorPresent = isActorPresent;
	}

	public int getTerrain() {
		return terrain;
	}

	public void setTerrain(int terrain) {
		this.terrain = terrain;
	}

}
