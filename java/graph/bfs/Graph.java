import java.util.LinkedList;

public class Graph {
	
	private int numVertices;
	private LinkedList<Integer>[] adjList;

	@SuppressWarnings("unchecked")
	
	public Graph(int vertices) {
		numVertices = vertices;
		adjList = (LinkedList<Integer>[]) new LinkedList[vertices];
		for (int i = 0; i < vertices; i++)
			adjList[i] = new LinkedList<>();
	}

	public void addEdge(int src, int dst) {
		adjList[src].add(dst);
		adjList[dst].add(src);
	}

	public void bfs(int startVertex) {
		boolean[] visited = new boolean[numVertices];
		LinkedList<Integer> queue = new LinkedList<>();

		visited[startVertex] = true;
		queue.add(startVertex);

		while (queue.size() != 0) {
			int currentVertex = queue.poll();
			System.out.print(currentVertex + " ");

			for (int neighbor : adjList[currentVertex]) {
				if (!visited[neighbor]) {
					visited[neighbor] = true;
					queue.add(neighbor);
				}
			}
		}
	}

	public static void main(String[] args) {
		Graph graph = new Graph(5);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(2, 3);
		graph.addEdge(2, 4);
		graph.addEdge(3, 4);

		System.out.println("BFS traversal starting from vertex 0:");
		graph.bfs(0);
	}
}
