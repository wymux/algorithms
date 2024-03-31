import java.util.ArrayList;
import java.util.List;

public class Graph {
	private int numVertices;
	private List<List<Integer>> adjList;

	public Graph(int vertices) {
		numVertices = vertices;
		adjList = new ArrayList<>(vertices);
		for (int i = 0; i < vertices; i++)
			adjList.add(new ArrayList<>());
	}

	public void addEdge(int src, int dest) {
		adjList.get(src).add(dest);
		adjList.get(dest).add(src);
	}

	public void printGraph() {
		for (int i = 0; i < numVertices; i++) {
			System.out.print("Vertex " + i + ": ");
			List<Integer> neighbors = adjList.get(i);
			for (int neighbor : neighbors)
				System.out.print(neighbor + " ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Graph graph = new Graph(5);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(2, 4);
		graph.addEdge(3, 4);

		graph.printGraph();
			
	}
}
