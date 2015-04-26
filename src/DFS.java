import java.util.Map;

public class DFS<T1, T2 extends NodeInterface<T1>> {
	private Map<T1, T2> graph;
	
	public DFS(Map<T1, T2> graph){
		this.graph = graph;
	}
	
	public void exec(){
		for (T2 node : graph.values()){
			node.setIsVisited(false);
		}
		visit(graph.keySet().iterator().next());
		
	}
	
	public void visit(T1 nodeId) {
		
		T2 node = graph.get(nodeId);
		if (!node.getIsVisited()) {
			node.setIsVisited(true);
			preEdge(nodeId, node);
			for (T1 id : node.getEdges()) {
				visit(id);
			}
			postEdge(nodeId, node);
		}
	}
	
	protected void postEdge(T1 elementId, T2 elementNode) {}

	protected void preEdge(T1 elementId, T2 elementNode) {}
}
