package graphs;

import java.util.Arrays;

public class BellmanFordShortestPath {

	//considering graph as 2D array	
	void bellmanFord(int [][] graph, int src) {
		int v=graph.length;
		
		int [] dist= new int[v];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[src]=0;
		
		for(int count=0;count<v-1;count++) {
			
			for(int u=0;u<v;u++) { //for every edge u,w
				for(int w=0;w<v;w++) { //for every edge u,w
					if(u!=w && graph[u][w]!=0) { //check whether directed edge is present
						if(dist[w]>dist[u]+graph[u][w])
							dist[w]=dist[u]+graph[u][w];
					}
				}
			}
		}
	}
}
