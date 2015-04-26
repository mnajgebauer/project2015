import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class Test {

	public static void main(String[] args) {
		
		Map<Integer, Node> graph = new HashMap<>();
		Node[] nodes = {
				new Node(2,3),
				new Node(4,5),
				new Node(1,6),
				new Node(5),
				new Node(3),
				new Node()
		
		};
		for (int i = 0 ; i<6 ; i++)
		graph.put(i+1, nodes[i]);
		
		System.out.println("Preorder: ");
		DFS<Integer, Node> preDfs = new PreDFS<>(graph);
		preDfs.exec();
		System.out.println();

		System.out.println("Postorder: ");
		DFS<Integer, Node> postDfs = new PostDFS<>(graph);
		postDfs.exec();
		System.out.println();
	}
}
