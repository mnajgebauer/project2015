import java.util.Map;

public class PreDFS<T1, T2 extends NodeInterface<T1>> extends DFS<T1, T2> {

	public PreDFS(Map<T1, T2> graph) {
		super(graph);
	}
	//test line test line
	
	//second line added
	@Override
	protected void preEdge(T1 nodeId, T2 node) {
		System.out.print(nodeId.toString() + " ");
	}
}
