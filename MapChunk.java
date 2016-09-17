
public class MapChunk {
	
	private GraphNode[][] chunkName;
	
	public MapChunk(GraphNode[][] chunkName){
		this.chunkName = chunkName;
	}

	public GraphNode[][] getChunkName() {
		return chunkName;
	}

	public void setChunkName(GraphNode[][] chunkName) {
		this.chunkName = chunkName;
	}
}
