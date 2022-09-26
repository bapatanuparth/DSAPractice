package graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class ShortestPathUnweighted {
	

	//use simple BFS
	//print distance of each node from the source
	//in BFS for first step adjacent nodes , print 1 1 1.. for next step adjacent, distance== 2 2 2.. and so on.
	//this will be the shortest distance from any given source
	//at each new visited, +1 to the distance of prev node == new dist
	static int[] shortestPath(List<ArrayList<Integer>> adj, int s, int v) {
		int dist[]= new int[v+1];
		dist[s]=0;
		Queue<Integer> q= new ArrayDeque<>();
		
		boolean visited[]= new boolean[v+1];
		q.add(s);
		
		while(!q.isEmpty()) {
			int u=q.poll();
			
			for(int x: adj.get(u)) {
				if(!visited[x]) {
					dist[x]=dist[u]+1;
					visited[x]=true;
					q.add(x);
				}
			}
		}
		
		return dist;
		
	
	}
}
