package graphs;
//assumptions -- vertex are numbered from 0 to V

import java.util.Arrays;

public class DijkstrasAlgorithm {

	// very naive code
	// O(v2)
	// use adjacency matrix and priority queue to reduce the complexity
	public int[] dijkstrasAlgo(int[][] graph, int src) {
		int v = graph.length;

		int dist[] = new int[v]; // to store the distance of each vertex from the source
		Arrays.fill(dist, Integer.MAX_VALUE); // intitialize all the distances as infinite
		dist[src] = 0;

		boolean[] fin = new boolean[v]; // finalized array -- shows if a vertex is finalized yet or not

		for (int count = 0; count < v - 1; count++) { // once u finalize v-1 vertices, last vertex will anyways be
														// shortest distance

			int u = -1; // vertex not yet finalized

			for (int i = 0; i < v; i++) {
				if (!fin[i] && (u == -1 || dist[i] < dist[u])) // consider all vertices which are not yet finalized and
																// whos dist is the minimum in the array
					u = i;
			} // at the end of this loop -- u is pointing to the vertex having minimum
				// distance

			fin[u] = true; // finalize that vertex

			// relax operation starts
			for (int i = 0; i < v; i++) { // consider each adjacent i of u

				if (!fin[i] && graph[u][i] != 0) // if i is not finalized and has a non zero distance from finalized
													// vertex u,
					dist[i] = Math.min(dist[i], dist[u] + graph[u][i]); // update distance array of i such that it shows
																		// the minimum value amongst the distance of i
																		// through u or the previous distance from src
																		// to i
			}

		}
		return dist;

	}
}
