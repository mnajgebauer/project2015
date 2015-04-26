import java.util.Map;


public class PostDFS<T1, T2 extends NodeInterface<T1>> extends DFS<T1, T2> {

	public PostDFS(Map<T1, T2> graph) {
		super(graph);
	}

	@Override
	protected void postEdge(T1 nodeId, T2 node) {
		System.out.print(nodeId.toString() + " ");
	}
}