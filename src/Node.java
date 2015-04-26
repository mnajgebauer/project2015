import java.util.LinkedList;
import java.util.List;


public class Node implements NodeInterface<Integer> {

	private boolean isVisited;
	private List<Integer> neighbours;

	public Node(List<Integer> neighbours) {
		this.neighbours = neighbours;
	}
	
	public Node(Integer... args) {
		this.neighbours = new LinkedList<Integer>();
		for(Integer i : args){
			this.neighbours.add(i);
		}
	}


	@Override
	public List<Integer> getEdges() {
		return neighbours;
	}

	@Override
	public boolean getIsVisited() {
		return isVisited;
	}

	@Override
	public void setIsVisited(boolean value) {
		isVisited = value;
	}
}
