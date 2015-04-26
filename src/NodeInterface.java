import java.util.List;

public interface NodeInterface<T1> {
	
	List<T1> getEdges();
	
	boolean getIsVisited();
	
	void setIsVisited(boolean value);
}
