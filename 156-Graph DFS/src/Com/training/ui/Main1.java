package Com.training.ui;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import Com.training.ds.Edge;
import Com.training.ds.Graph;

public class Main1 {

	public static void main(String[] args) {

		List<Edge> edges = Arrays.asList(new Edge(1, 2), new Edge(1, 7), new Edge(1, 8),
				new Edge(2, 3), new Edge(2, 6),
				new Edge(3, 4), new Edge(3, 5), new Edge(8, 9), 
				new Edge(8, 12), new Edge(9, 10), new Edge(9, 11));

		// total number of nodes
		int n = 13;
		
		// build a graph fromthe given edges
		Graph graph = new Graph(edges, n);

		// to keep track of whether a vertex is discovered or not
		boolean[] discovered = new boolean[n];
		for (int i = 0; i < n; i++) {
			if (!discovered[i]) {
				iterativeDFS(graph, i, discovered);
			}
		}

	}

	public static void iterativeDFS(Graph graph, int v, boolean[] discovered) {

		
		//create a stack used to do iterative DFS
		Stack<Integer> stack = new Stack<>();
		
		stack.push(v);
		
		while (!stack.empty()) {
        //pop vertex from the stack
		v = stack.pop();

			//if the vertex is already discover yet,ignore it
			if (discovered[v]) {
				continue;
			}

			//we will reach here if the popped vertex v is not discovered yet
			//print v and process its undiscovered adjacent nodes into the stack
			discovered[v] = true;
			System.out.println(v + " ");
            //do for every edge(v,u)
			List<Integer> adjList = graph.adjList.get(v);
			for (int i = adjList.size() - 1; i >= 0; i--) {
				int u = adjList.get(i);
				if (!discovered[u]) {
					stack.push(u);
				}
			}

		}

	}

}
